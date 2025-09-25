# Proyecto CRUD en AWS con Spring Boot y MariaDB

## Introducción
Este proyecto consiste en una aplicación web para la gestión de datos inmobiliarios, desarrollada con Spring Boot. La aplicación implementa operaciones de **CRUD** (Crear, Leer, Actualizar y Eliminar) sobre una base de datos **MariaDB** alojada en AWS. El frontend permite interactuar de manera sencilla con la información, mientras que el backend maneja la lógica y la persistencia de datos en la nube.

Se desplegó la aplicación en **instancias EC2 de AWS**, separando los servicios de backend/front y la base de datos para asegurar escalabilidad y seguridad.  

---

## Objetivo
El objetivo principal de este proyecto es demostrar la integración de una aplicación Spring Boot con una base de datos MariaDB en AWS, implementando un sistema CRUD completo y desplegando la aplicación en instancias EC2 accesibles mediante la IP pública.

---

## Marco Teórico
- **AWS EC2**: Servicio que permite crear instancias virtuales escalables en la nube, donde se pueden ejecutar aplicaciones y servicios.
- **MariaDB**: Sistema de gestión de bases de datos relacional, compatible con MySQL, utilizado para almacenar de forma segura los datos de la aplicación.
- **Spring Boot**: Framework que facilita la creación de aplicaciones Java listas para producción, con configuración mínima y soporte para web y persistencia de datos.
- **CRUD**: Conjunto de operaciones básicas para la manipulación de datos:  
  - **Crear**: agregar nuevos registros.  
  - **Leer**: consultar información existente.  
  - **Actualizar**: modificar registros existentes.  
  - **Eliminar**: borrar registros de manera segura.
- **Despliegue en la nube**: Se utilizó la IP pública de la instancia EC2 y se configuró el Security Group para habilitar el puerto 8080, permitiendo el acceso desde cualquier navegador.

---

## Pruebas
Verificamos que las instancias quedaron bien creadas (una para backend/front y otra para la base de datos):

<img width="1522" height="77" alt="{B6687983-CFFB-422E-8FD8-EDB07986BE55}" src="https://github.com/user-attachments/assets/fac1bef5-0cbd-4e5d-b041-886aca732aac" />

En el código vemos que se conectó la base de datos de AWS mediante la IP de su respectiva instancia:

<img width="506" height="99" alt="{165FE3A0-0197-444F-8B16-DFDC52E61864}" src="https://github.com/user-attachments/assets/1f751e82-9f1c-4e76-865f-829f95f29d8d" />

Luego nos conectamos a la consola de la instancia y subimos el `.jar` que nos generó el `mvn clean package`:

<img width="835" height="41" alt="{33C2C465-CAE5-4779-82FE-E9CC72478977}" src="https://github.com/user-attachments/assets/80b0377d-7d89-4218-bf03-40f3c08f9f92" />

Lo ponemos a correr y al hacer un `curl` junto con la URL, nos muestra el HTML que nos mostraría en la página:

<img width="671" height="621" alt="{F0660E6A-6A05-4846-98EA-F13D4C8BC0B0}" src="https://github.com/user-attachments/assets/fdcc057a-ee1e-4565-9686-11006aa471f5" />

Luego ya podemos visitar la página, dando como resultado que se subió correctamente el archivo:

<img width="1227" height="673" alt="{17369E7F-2AA7-41D9-A8DE-98D5FEEBBD71}" src="https://github.com/user-attachments/assets/4c732914-aa2a-4a21-a6ec-3f497092eb7e" />

Ahora probamos el CRUD:

<img width="470" height="393" alt="{CDF73A9F-ED9E-422A-85DF-14C9101EE27F}" src="https://github.com/user-attachments/assets/07c7da90-6e91-4471-94e0-9fc58b64903a" />

Al dar click en **Guardar**:

<img width="1209" height="196" alt="{7D1CEAE1-CC15-4E66-80D6-F3636E0DDDDE}" src="https://github.com/user-attachments/assets/cca9825e-df36-4c39-b225-8bc87b7740a1" />

También podemos **editar** los datos para cada ítem:

<img width="1217" height="612" alt="{FF3F1189-DA8C-4485-9EFE-3180EFDCDFDA}" src="https://github.com/user-attachments/assets/f0e6a9e7-58c6-49d6-802b-a12303a7ccf0" />

Por ejemplo, al poner en la descripción: "Tres habitaciones y 2 baños":

<img width="1216" height="198" alt="{D603D782-F96C-4772-936C-2F1333A190C2}" src="https://github.com/user-attachments/assets/d8ce635c-92a7-406a-b19d-adb0a794a58f" />

Y de igual manera podemos **eliminar** los ítems, mostrando una advertencia de confirmación:

<img width="456" height="155" alt="{CB6DC446-2176-47C9-AC1B-B4765EE0ADA6}" src="https://github.com/user-attachments/assets/b61ba2de-7928-4fb5-a551-bc3bde0694f9" />

---

## Video

https://youtu.be/R-xeFWtAANM
