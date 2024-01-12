from pytube import Youtube
import os

def download_video(url, outputh_path):
    try:
        yt = Youtube(url)
        print(f"Descargando video: {yt.tittle}...")
        yt.streams.get_highest_resolution().download(outputh_path=outputh_path)
        print(f"{yt.tittle} succesfully download")
    except Exception as e:
        print (f"Video cant be download: {str(e)}")

def main():
    url = input("Introduce the URL of the youtube video: ")

    #Obtener la ruta del directorio del proyecto
    project_directory = os.path.dirname(os.path.abspath(__file__))
    outputh_path = os.path.join(project_directory, 'Descargas') #Directorio de descarga

    print(f"The directory of the proyect is: {project_directory}")
    print(f"The files saves in: {outputh_path}")

    download_video(url, outputh_path)

if __name__ == "__main__":
    main()