El objetivo de este código, es validar la funcionalidad de carrito de compras y proceso de pago para la página www.toysarray.com, donde se procederá a ingresar, a continuación, con ayuda de la barra de búsqueda, ingresara el artículo deseado, una vez se obtenga la lista de elementos que concuerden a la busqueda, se eligirá el articulo a comprar,se seleccionará la referencia y cantidad a comprar. Una vez se agrege el elemento al carrito de comprar, se validará que aparezca en dicho módulo y se procederá a realizar la compra, llenando los datos solicitados y eligiendo el servicio de mensajería deseado (no se realiza el pago final).

Durante este proceso, la aplicación está validando constantemente si hay conexión a internet y si los elementos de la página web a interactuar estan habilitados/visibles para su uso. Adicionalmente, se actualizará un archivo Excel contenido en la carpeta raiz (Datos articulo.xlsx), donde se guardarán los datos del artículo comprado (Nombre, valor y descripción). En caso de que el archivo Ecel sea eliminado (o renombrado), el aplicativo informará al usuario del inconveniente.

Finalmente, se abrirá de forma automática un infrome, donde se podrá visualizar a detalle los resultados de la ejecución realizada.

Para ejecutar el aplicativo, se debe ejecutar el archivo llamado "EjecutarDemoWeb.bat" contenido en la carpeta raiz de la aplicación.

Importante: - No es necesario tener el aplicativo Exportado/abierto en algún IDE
	    - Es posible que la primeras vez en ejecutarse el aplicativo, tome bastante tiempo mientras inicie.
	    - El archivo Excel DEBE estar cerrado, en caso contrario, no se guardarán los datos.