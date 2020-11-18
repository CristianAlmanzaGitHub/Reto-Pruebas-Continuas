#language: es
Característica: Carrito de compras de Toy Sarray

  Escenario: Yo como usuario quiero buscar un articulo en especifico, agregarlo al carrito de compras y validar que quede registrado
    Dado que estoy en la pagina de inicio de Toy Sarray
    Cuando busco un articulo en especifico "RC car"
    Entonces podre visualizar los diferentes articulos relacionados
    Cuando selecciono el articulo deseado
    Entonces podre visualizar las caracteristicas del articulo seleccionado
    Cuando agrego el articulo al carrito
    Y luego valido el carrito de compras
    Entonces podre visualizar el articulo a comprar y el precio total de "$84.00"
    Cuando continuo el proceso de compra, ingreso mis datos personales
      | correo                     | nombre   | apellido | direccion         | casa    | ciudad | pais     | departamento | postalCode |
      | cristian.almanza@correo.co | Cristian | Almanza  | Carrera 1 N 32 45 | Casa D5 | Bogota | Colombia | CUN          |     500001 |
    Y selecciono modo de envio
    Entonces podre visualizar el formulario de Forma de Pago
