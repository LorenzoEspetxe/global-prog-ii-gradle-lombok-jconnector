package org.niidea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Instanciamos algunas UnidadDeMedida:
        UnidadDeMedida unidadMililitros = new UnidadDeMedida("mililitros");
        UnidadDeMedida unidadGramos = new UnidadDeMedida("gramos");
        UnidadDeMedida unidadUnidades = new UnidadDeMedida("unidades");

        // System.out.println(unidadMililitros);
        // System.out.println(unidadGramos);
        // System.out.println(unidadUnidades);

        // Instanciamos Imagenes para algunos articulos:
        Imagen imagenCerveza = new Imagen("Imagen: Cerveza Rubia Artesanal");
        Imagen imagenCocaCola = new Imagen("Imagen: Coca Cola en Lata");

        // Instanciamos la Imagen de Pizza:
        Imagen imagenPizzaMuzza = new Imagen("Imagen: Pizza Muzzarella Grande");
        // Y la Imagen de sus ingredientes:
        Imagen imagenMasaPizza = new Imagen("Imagen: Masa para Pizza");
        Imagen imagenSalsaTomate = new Imagen("Imagen: Salsa de Tomate para Pizza");
        Imagen imagenQuesoMuzzarella = new Imagen("Imagen: Queso Muzzarella Rallado");

        // Instanciamos la Imagen de PapasFritas:
        Imagen imagenPapasFritas = new Imagen("Imagen: Porción Papas Fritas");
        // Y la Imagen de sus ingredientes:
        Imagen imagenPapas = new Imagen("Imagen: Papas para Freír");
        Imagen imagenAceite = new Imagen("Imagen: Aceite Vegetal");
        Imagen imagenSal = new Imagen("Imagen: Sal Fina");

        // Una imgen para una promocion
        Imagen imagenPromoMuzzaConQuilmes = new Imagen("Imagen: Pizza Muzza con Botella de Quilmes");


        // Instanciamos ArticuloInsumos, les cargamos las imagenes:

        ArticuloInsumo papaInsumo = ArticuloInsumo.builder().nombre("Papa").unidadDeMedida(unidadGramos).esParaElaborar(true).build();
        papaInsumo.agregarImagen(imagenPapas);
        ArticuloInsumo aceiteInsumo = ArticuloInsumo.builder().nombre("Aceite Vegetal").unidadDeMedida(unidadMililitros).esParaElaborar(true).build();
        aceiteInsumo.agregarImagen(imagenAceite);
        ArticuloInsumo salInsumo = ArticuloInsumo.builder().nombre("Sal").unidadDeMedida(unidadGramos).esParaElaborar(true).build();
        salInsumo.agregarImagen(imagenSal);
        ArticuloInsumo masaPizzaInsumo = ArticuloInsumo.builder().nombre("Masa para Pizza").unidadDeMedida(unidadGramos).esParaElaborar(true).build();
        masaPizzaInsumo.agregarImagen(imagenMasaPizza);
        ArticuloInsumo quesoMuzzarellaInsumo = ArticuloInsumo.builder().nombre("Queso Muzzarella").unidadDeMedida(unidadGramos).esParaElaborar(true).build();
        quesoMuzzarellaInsumo.agregarImagen(imagenQuesoMuzzarella);
        ArticuloInsumo salsaDeTomateInsumo = ArticuloInsumo.builder().nombre("Salsa de Tomate").unidadDeMedida(unidadMililitros).esParaElaborar(true).build();
        salsaDeTomateInsumo.agregarImagen(imagenSalsaTomate);
        ArticuloInsumo quilmesDeLitroInsumo = ArticuloInsumo.builder().nombre("Cerveza Quilmes - 1 litro").unidadDeMedida(unidadUnidades).esParaElaborar(false).build();
        quilmesDeLitroInsumo.agregarImagen(imagenCerveza);
        ArticuloInsumo cocaColaDeLitro = ArticuloInsumo.builder().nombre("Gaseosa Coca-Cola - 1 litro").unidadDeMedida(unidadUnidades).esParaElaborar(false).build();
        quilmesDeLitroInsumo.agregarImagen(imagenCerveza);


        // Instanciamos los detalles de unas Papas:
        ArticuloManufacturadoDetalle detallePapaFritaPapa = new ArticuloManufacturadoDetalle(500, papaInsumo);
        ArticuloManufacturadoDetalle detallePapaFritaAceite = new ArticuloManufacturadoDetalle(500, aceiteInsumo);
        ArticuloManufacturadoDetalle detallePapaFritaSal = new ArticuloManufacturadoDetalle(50, salInsumo);

        // Instanciamos los detalles para una Muzza:
        ArticuloManufacturadoDetalle detallePizzaMuzzaMasa = new ArticuloManufacturadoDetalle(1000, masaPizzaInsumo);
        ArticuloManufacturadoDetalle detallePizzaMuzzaSalsa = new ArticuloManufacturadoDetalle(300, salsaDeTomateInsumo);
        ArticuloManufacturadoDetalle detallePizzaMuzzaMuzzarella = new ArticuloManufacturadoDetalle(300, quesoMuzzarellaInsumo);


        // Chequeamos que vaya mas o menos bien
        /*
        System.out.println("Detalles para Papas Fritas:");
        System.out.println(detallePapaFritaPapa);
        System.out.println(detallePapaFritaAceite);
        System.out.println(detallePapaFritaSal);

        System.out.println("\nDetalles para Pizza Muzzarella:");
        System.out.println(detallePizzaMuzzaMasa);
        System.out.println(detallePizzaMuzzaSalsa);
        System.out.println(detallePizzaMuzzaMuzzarella);
        */

        // Instanciamos Papas y Muzza

        ArticuloManufacturado papasMedianas = ArticuloManufacturado.builder().nombre("Papas Fritas (Porción)").unidadDeMedida(unidadUnidades).tiempoEstimadoMinutos(15).build();
        papasMedianas.setDescripcion("Deliciosas papas fritas caseras.");
        papasMedianas.setPreparacion("Cortar papas, freír en aceite caliente, salar al gusto.");
        papasMedianas.agregarDetalleInsumos(detallePapaFritaPapa);
        papasMedianas.agregarDetalleInsumos(detallePapaFritaAceite);
        papasMedianas.agregarDetalleInsumos(detallePapaFritaSal);
        papasMedianas.agregarImagen(imagenPapasFritas);

        ArticuloManufacturado muzza8Porciones = ArticuloManufacturado.builder().nombre("Pizza Muzzarella (Grande)").unidadDeMedida(unidadUnidades).tiempoEstimadoMinutos(20).build();
        muzza8Porciones.setDescripcion("Clásica pizza de muzzarella con salsa de tomate.");
        muzza8Porciones.setPreparacion("Estirar masa, agregar salsa y muzzarella, hornear.");
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaMasa);
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaSalsa);
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaMuzzarella);
        muzza8Porciones.agregarImagen(imagenPizzaMuzza);

        //System.out.println(muzza8Porciones);
        //System.out.println(papasMedianas);

        Promocion muzzaConQuilmesDeLitro = Promocion.builder()
                .nombre("Promo Muzza + Quilmes de Litro")
                .fechaDesde(LocalDate.of(2025, 5, 24))
                .fechaHasta(LocalDate.of(2025, 6, 30))
                .horaHasta(LocalTime.of(23, 59))
                .descripcionDescuento("Disfruta de una pizza muzzarella grande con una cerveza Quilmes de 1 litro a un precio especial.")
                .precioPromocional(5500.0)
                .tipoPromocion(TipoPromocion.PROMOCION1)
                .build();
        muzzaConQuilmesDeLitro.agregarArticulos(muzza8Porciones);
        muzzaConQuilmesDeLitro.agregarArticulos(quilmesDeLitroInsumo);
        muzzaConQuilmesDeLitro.agregarImagenes(imagenPromoMuzzaConQuilmes);

        // System.out.println(muzzaConQuilmesDeLitro);

        // INSTANCIAMOS CATEGORIAS, creamos la relacion de subcategorias tambien

        Categoria categoriaComidas = Categoria.builder().nombre("Comidas").build();
        Categoria categoriaSnacks = Categoria.builder().nombre("Snacks").build();
        Categoria categoriaPizzas = Categoria.builder().nombre("Pizzas").build();
        categoriaComidas.agregarSubcategoria(categoriaPizzas);
        categoriaComidas.agregarSubcategoria(categoriaSnacks);

        Categoria categoriaBebidas = Categoria.builder().nombre("Bebidas").build();
        Categoria categoriaBebidasAlcoholicas = Categoria.builder().nombre("Bebidas Alcohólicas").build();
        Categoria categoriaGaseosas = Categoria.builder().nombre("Gaseosas").build();
        categoriaBebidas.agregarSubcategoria(categoriaBebidasAlcoholicas);
        categoriaBebidas.agregarSubcategoria(categoriaGaseosas);

        /*
        System.out.println("Categoría Padre de Bebidas Alcohólicas: " + (categoriaBebidasAlcoholicas.getCategoriaPadre() != null ? categoriaBebidasAlcoholicas.getCategoriaPadre().getNombre() : "N/A"));
        System.out.println("Subcategorías de Bebidas: " + categoriaBebidas.getSetDeSubcategorias().stream().map(Categoria::getNombre).collect(java.util.stream.Collectors.joining(", ")));
        System.out.println("Categoría Padre de Gaseosas: " + (categoriaGaseosas.getCategoriaPadre() != null ? categoriaGaseosas.getCategoriaPadre().getNombre() : "N/A"));
        System.out.println("Categoría Padre de Pizzas: " + (categoriaPizzas.getCategoriaPadre() != null ? categoriaPizzas.getCategoriaPadre().getNombre() : "N/A"));
        System.out.println("Subcategorías de Comidas: " + categoriaComidas.getSetDeSubcategorias().stream().map(Categoria::getNombre).collect(java.util.stream.Collectors.joining(", ")));
         */

        // Instanciamos DetallePedido y DetallePromo

        DetallePedido detallePedidoPapas = DetallePedido.builder().cantidad(2).articulo(papasMedianas).build();
        DetallePedido detallePedidoBirra = DetallePedido.builder().cantidad(2).articulo(quilmesDeLitroInsumo).build();
        DetallePromocion detallePromocionMuzzaBirra = DetallePromocion.builder().cantidad(1).subTotal(muzzaConQuilmesDeLitro.getPrecioPromocional()).promocion(muzzaConQuilmesDeLitro).build();

        // System.out.println(detallePromocionMuzzaBirra);
        // System.out.println(detallePedidoBirra);
        // System.out.println(detallePedidoPapas);


        // Instanciamos de Pais, Provincia, Localidad, Domicilio, Sucursales y Empresa

        Pais paisArgentina = Pais.builder().nombre("Argentina").build();
        Provincia provinciaBuenosAires = Provincia.builder().nombre("Buenos Aires").pais(paisArgentina).build();
        Localidad localidTigre = Localidad.builder().nombre("Tigre").provincia(provinciaBuenosAires).build();
        Localidad localidadMarDelPlata = Localidad.builder().nombre("Mar del Plata").provincia(provinciaBuenosAires).build();
        Domicilio domicilio1 = Domicilio.builder().calle("Calle Mitre").numero(123).cp(1900).localidad(localidTigre).build();
        Domicilio domicilio2 = Domicilio.builder().calle("Avenida San Martin").numero(742).cp(7600).localidad(localidadMarDelPlata).build();
        Sucursal sucursal1 = Sucursal.builder().nombre("Sucursal La Plata Centro").horarioApertura(LocalTime.of(9, 0)).horarioCierre(LocalTime.of(22, 0)).domicilio(domicilio1).build();
        Sucursal sucursal2 = Sucursal.builder().nombre("Sucursal Mar del Plata Güemes").horarioApertura(LocalTime.of(10, 0)).horarioCierre(LocalTime.of(23, 0)).domicilio(domicilio2).build();
        Empresa rotiseriaTioPanza = Empresa.builder().nombre("Rotiseria Tio Panza").razonSocial("Rotiseria Tio Panza S.R.L.").cuil(2012345558).build();
        rotiseriaTioPanza.agregarSucursal(sucursal1);
        rotiseriaTioPanza.agregarSucursal(sucursal2);

        /*
        System.out.println(paisArgentina);
        System.out.println(provinciaBuenosAires);
        System.out.println(localidTigre);
        System.out.println(localidadMarDelPlata);
        System.out.println(domicilio1);
        System.out.println(domicilio2);
        System.out.println(sucursal1);
        System.out.println(sucursal2);
        System.out.println(rotiseriaTioPanza);
         */

        // Instanciamos Usuarios y Clientes

        Usuario usuarioAdmin = Usuario.builder().auth0id("auth0|123456789").username("admin_user").build();
        Usuario usuarioCliente = Usuario.builder().auth0id("auth0|987654321").username("cliente_ejemplo").build();

        ImagenCliente imagenCliente1 = ImagenCliente.builder().nombreImagen("perfil_usuario_1.jpg").build();
        ImagenCliente imagenCliente2 = ImagenCliente.builder().nombreImagen("perfil_usuario_2.png").build();

        Cliente cliente1 = Cliente.builder().usuario(usuarioCliente).nombre("Juan").apellido("Perez").telefono("1122334455").email("juan.perez@example.com").fechaNacimiento(LocalDate.of(1990, 5, 15)).imagenCliente(imagenCliente1).build();
        Cliente cliente2 = Cliente.builder().usuario(usuarioAdmin).nombre("Maria").apellido("Gomez").telefono("1198765432").email("maria.gomez@example.com").fechaNacimiento(LocalDate.of(1985, 10, 20)).imagenCliente(imagenCliente2).build();

        //System.out.println(cliente2);
        //System.out.println(cliente1);

        // Instanciamos Facturas, Pedidos y se los asiganmos a los clientes

        Factura factura1 = Factura.builder().fechaFacturacion(LocalDate.now()).mpPaymentId(1001).mpMerchantOrderId(2001).mpPreferenceId("MP-PREF-XYZ123").mpPaymentType("Mercado Pago").formaPago(FormaPago.MERCADOPAGO).totalVenta(5500.0).build();
        Factura factura2 = Factura.builder().fechaFacturacion(LocalDate.now().minusDays(5)).mpPaymentId(1002).mpMerchantOrderId(2002).mpPreferenceId("MP-PREF-ABC456").mpPaymentType("cash").formaPago(FormaPago.EFECTIVO).totalVenta(800.0).build();

        Pedido pedido1 = Pedido.builder().sucursal(sucursal1).domicilio(sucursal1.getDomicilio()).factura(factura1).horaEstimadaFinalizacion(LocalTime.of(21, 30)).fechaPedido(LocalDate.now()).total(detallePromocionMuzzaBirra.getSubTotal()).totalCosto(4000.0).estado(Estado.PENDIENTE).formaPago(FormaPago.MERCADOPAGO).build();
        pedido1.agregarDetallePromocion(detallePromocionMuzzaBirra);

        Pedido pedido2 = Pedido.builder().sucursal(sucursal2).domicilio(sucursal2.getDomicilio()).factura(factura2).horaEstimadaFinalizacion(LocalTime.of(22, 0)).fechaPedido(LocalDate.now()).estado(Estado.PENDIENTE).formaPago(FormaPago.EFECTIVO).build();
        pedido2.agregarDetallePedido(detallePedidoBirra);
        pedido2.agregarDetallePedido(detallePedidoPapas);

        System.out.println(pedido1);
        System.out.println(pedido2);

        cliente1.agregarPedido(pedido1);
        cliente2.agregarPedido(pedido2);
    }
}
