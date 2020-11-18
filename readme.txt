El objetivo de este c�digo, es validar la funcionalidad de carrito de compras y proceso de pago para la p�gina www.toysarray.com, donde se proceder� a ingresar, a continuaci�n, con ayuda de la barra de b�squeda, ingresara el art�culo deseado, una vez se obtenga la lista de elementos que concuerden a la busqueda, se eligir� el articulo a comprar,se seleccionar� la referencia y cantidad a comprar. Una vez se agrege el elemento al carrito de comprar, se validar� que aparezca en dicho m�dulo y se proceder� a realizar la compra, llenando los datos solicitados y eligiendo el servicio de mensajer�a deseado (no se realiza el pago final).

Durante este proceso, la aplicaci�n est� validando constantemente si hay conexi�n a internet y si los elementos de la p�gina web a interactuar estan habilitados/visibles para su uso. Adicionalmente, se actualizar� un archivo Excel contenido en la carpeta raiz (Datos articulo.xlsx), donde se guardar�n los datos del art�culo comprado (Nombre, valor y descripci�n). En caso de que el archivo Ecel sea eliminado (o renombrado), el aplicativo informar� al usuario del inconveniente.

Finalmente, se abrir� de forma autom�tica un infrome, donde se podr� visualizar a detalle los resultados de la ejecuci�n realizada.

Para ejecutar el aplicativo, se debe ejecutar el archivo llamado "EjecutarDemoWeb.bat" contenido en la carpeta raiz de la aplicaci�n.

Importante: - No es necesario tener el aplicativo Exportado/abierto en alg�n IDE
	    - Es posible que la primeras vez en ejecutarse el aplicativo, tome bastante tiempo mientras inicie.
	    - El archivo Excel DEBE estar cerrado, en caso contrario, no se guardar�n los datos.