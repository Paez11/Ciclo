interface Note{
    id?:number,
    title:string,
    description:string
}

//let note:Note[];
function addNote(){
    console.log("Adding a new note");
    let title:HTMLInputElement= document.getElementById("title") as HTMLInputElement;
    let description:HTMLInputElement = document.getElementById("description") as HTMLInputElement;
    if(title && description){
        title.value="";
        description.value = "";
    }
}

function editeNote(id:any){
    
    console.log("Editing note");

    let note:Note|undefined = notes.find(n =>n.id == id);
    console.log(note);
    let title:HTMLInputElement= document.getElementById("title2") as HTMLInputElement;
    let description:HTMLInputElement = document.getElementById("description2") as HTMLInputElement;
    if(note){
        title.value=note.title;
        description.value=note.description;
    }

    let boton:HTMLButtonElement= document.getElementById("myBtn2") as HTMLButtonElement;

    boton.onclick = ()=>{
        if(note&&title.value.length > 0 && description.value.length > 0){
            note.title=title.value.trim();
            note.description=description.value.trim();
            let closeModal:HTMLButtonElement = document.getElementById('closeModal2') as HTMLButtonElement;
            closeModal.click();
            drawTable();
            console.log(notes);
            localStorage.setItem('notes',JSON.stringify(notes));
        }else{
            alert("El campo título y descripción deben contener información.")
        }
    }

   
}

function removeNote(id:any){
    let confirmed = confirm("¿Seguro que desea eliminar la nota?");
    if(!confirmed) return;
    let newNotes = notes.filter(e=>e.id!=id);
    //array que contiene todos los elementos, excepto aquellos cuyo id es = a id
    notes=newNotes;
    drawTable();
    console.log(notes);
    //persistir la nueva lista
    localStorage.setItem('notes',JSON.stringify(notes));

    //fin persistencia
}
function save(){
    console.log("Saving a note");
    let title:HTMLInputElement= document.getElementById("title") as HTMLInputElement;
    let description:HTMLInputElement = document.getElementById("description") as HTMLInputElement;
    
    if(title && description){
        title.value=title.value.trim();
        description.value=description.value.trim();

        if(title.value.length > 0 && description.value.length > 0){
            //guardo
            let newNote:Note ={
                title:title.value,
                description:description.value,
                id:Math.floor(Math.random()*10000)+1
            }
            notes.push(newNote);
            let closeModal:HTMLButtonElement = document.getElementById('closeModal') as HTMLButtonElement;
            closeModal.click();
            drawTable();
            console.log(notes);
            //persistir la nueva lista
            localStorage.setItem('notes',JSON.stringify(notes));

            //fin persistencia
        }else{
            alert("El campo título y descripción deben contener información.")
        }
    } 
}
function drawTable(){
    let table:HTMLTableElement = document.getElementById('tableNotes') as HTMLTableElement;
    table.innerHTML="";
    notes.forEach((note)=>{
        let row:HTMLTableRowElement = drawRow(note);
        table.appendChild(row);
    });
}
function drawRow(note:Note):HTMLTableRowElement{
    let row:HTMLTableRowElement = document.createElement("tr") as HTMLTableRowElement;
    row.className="table-striped";
    let td1:HTMLTableCellElement = document.createElement("td") as HTMLTableCellElement;
    td1.innerHTML = note.title;
    row.appendChild(td1);
    td1.classList.add('title');
    let td2:HTMLTableCellElement = document.createElement("td") as HTMLTableCellElement;
    td2.innerHTML = note.description;
    row.appendChild(td2);
    td2.classList.add('description');
    let td3:HTMLTableCellElement = document.createElement("td") as HTMLTableCellElement;
    let button1:HTMLButtonElement = document.createElement('button') as HTMLButtonElement;
    let td4:HTMLTableCellElement = document.createElement("td") as HTMLTableCellElement;
    let button2:HTMLButtonElement = document.createElement("button") as HTMLButtonElement;
    button2.className="btn btn-secondary";

    button1.onclick=()=>{
        editeNote(note.id);
        
    }

    button2.onclick=()=>{
        removeNote(note.id);
    }

    button1.innerHTML=` <div type="button" data-bs-toggle="modal" data-bs-target="#exampleModal2" fill="currentColor" class="btn btn-secondary">Editar</div>`;
    button2.innerHTML=`
    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3-fill" viewBox="0 0 16 16">
                    <path d="M11 1.5v1h3.5a.5.5 0 0 1 0 1h-.538l-.853 10.66A2 2 0 0 1 11.115 16h-6.23a2 2 0 0 1-1.994-1.84L2.038 3.5H1.5a.5.5 0 0 1 0-1H5v-1A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5Zm-5 0v1h4v-1a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5ZM4.5 5.029l.5 8.5a.5.5 0 1 0 .998-.06l-.5-8.5a.5.5 0 1 0-.998.06Zm6.53-.528a.5.5 0 0 0-.528.47l-.5 8.5a.5.5 0 0 0 .998.058l.5-8.5a.5.5 0 0 0-.47-.528ZM8 4.5a.5.5 0 0 0-.5.5v8.5a.5.5 0 0 0 1 0V5a.5.5 0 0 0-.5-.5Z"></path>
                    </svg>
    `;
    td3.appendChild(button1);
    row.appendChild(td3);
    td4.appendChild(button2);
    row.appendChild(td4);
    return row;
}

/**
 *  Cargo la lista de persistence
 */
let notesString:string | null = localStorage.getItem('notes');
let notes:Note[];
if(notesString==null){
    notes = [];
}else{
    notes = JSON.parse(notesString);
}
console.log(notesString);
/**
 * Pinto la tabla
 */
drawTable();