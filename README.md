# Getting Started

git clone https://github.com/SergioValleGarma/JavaPostgres.git


bash
# Construir y levantar los contenedores
docker-compose up --build

# Ejecutar en segundo plano
docker-compose up -d

# Detener los contenedores
docker-compose down

Una vez ejecutada, accede a:

http://localhost:8080/empleados - Lista de empleados

http://localhost:8080/empleados/nuevo - Agregar nuevo empleado

http://localhost:8080/empleados/editar/{id} - Editar empleado existente




