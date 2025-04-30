package com.daniereina.DanielaManzanares_00051316.data

import com.daniereina.DanielaManzanares_00051316.model.Dish
import com.daniereina.DanielaManzanares_00051316.model.Restaurant

val fakeRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Hut",
        description = "La alegira de compartir.",
        imageUrl = "https://scontent.fsal10-1.fna.fbcdn.net/v/t39.30808-6/352709979_919898212453756_5479123028414988784_n.png?_nc_cat=1&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=EniCOgURc38Q7kNvwEFBpTC&_nc_oc=AdnGy5iPNOdXotnB8R17N92N8cXaN7E5gbq8we4zGav30uNsgcfyaUZYJlkaH17eKWE&_nc_zt=23&_nc_ht=scontent.fsal10-1.fna&_nc_gid=eI9FCD4yLDomJrxtguAzqQ&oh=00_AfGCgffQ67LFg9R6FalwCRoZgVQSNE_Yj_zt9WW2ox59yQ&oe=68172934",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(1, "Pizza Diavola", "Queso mozzarella, mezcla de vegetales rostizados, pepperoni y jalapeno con hierbas italianas", "https://www.pizzahut.com.sv/static/media/images/products/webp/ESM_14349_MD_11-06-2024-00-13.webp?2.0.26"),
            Dish(2, "Pizza Super Suprema", "Carne, pepperoni, salchicha italiana, jamon Virginia, aceituna negras, hongos, cebolla, chille verde y queso Mozzarella", "https://www.pizzahut.com.sv/static/media/images/products/webp/ESM_12963_SM_08-11-2023-09-58.webp?2.0.26")
        )
    ),
    Restaurant(
        id = 2,
        name = "Papa Johns",
        description = "Mejores ingredientes, mejor pizza",
        imageUrl = "https://scontent.fsal10-1.fna.fbcdn.net/v/t39.30808-6/274459887_10159773606361670_3207006310946833723_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=2Wclqpz2kegQ7kNvwEv1oH1&_nc_oc=Adk7daxl7aJILB9vej-F89NCPlvWQRhqhapxY9sBUsZBR8I-2cUtAgcmQg0da38L5d4&_nc_zt=23&_nc_ht=scontent.fsal10-1.fna&_nc_gid=nYZStwvZlZB5qxRoqz4FZw&oh=00_AfE99Cm8xqqCWm98iYOsAJ0_R-vcsYG4LljLXd5Fhxb1WQ&oe=68171E66",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(3, "The Works", "Combinación irresistible de pepperoni, jamón, salchicha italiana, rodajas de cebolla y chile verde, Hongos, aceitunas negras maduras y queso mozzarella.", "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-2/the-works.jpg"),
            Dish(4, "Tuscan Six Cheese", "Cubierta de salsa de pizza y seis quesos premium: mozzarella, parmesano, romano, asiago, provolone y fontina", "https://pjsv-images.nyc3.digitaloceanspaces.com/common-files/product-2/the-works.jpg")
        )
    ),

    Restaurant(
        id = 3,
        name = "Dominos Pizza",
        description = "La comida mas deliciosa",
        imageUrl = "https://scontent.fsal13-1.fna.fbcdn.net/v/t39.30808-6/347888025_799744128471726_1601492710825412510_n.png?_nc_cat=105&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=InlMr0LmADEQ7kNvwEoW5wp&_nc_oc=AdlmJZNLr7eZ7UkSy5eMhdarH7L6_LKX3vkcUCKMRVoh7jKzhyMREFx0KHauT-RZ85A&_nc_zt=23&_nc_ht=scontent.fsal13-1.fna&_nc_gid=c2kzkdyVcm0wD5EM__EkmA&oh=00_AfHFCcphwzsMtnmb8YlKbeXmRcBVV4ZSaVx2eWYp6s8V_Q&oe=68173606",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(5, "La+4", "Queso Mozzarella, pepperoni, jamon, pina, cebolla, tocino y jalapeno", "https://dominos.com.sv/images_uploaded/productos/Foto/2417-Foto_producto-20250331114805.jpg"),
            Dish(6, "Full Carnes", "Pepperoni, jamon, salchica italiana y carne", "https://dominos.com.sv/images_uploaded/productos/Foto/755-Foto_producto-20220125224153.png")
        )
    ),
    Restaurant(
        id = 4,
        name = "Panda Express",
        description = "Frescura japonesa servida al instante.",
        imageUrl = "https://scontent.fsal14-1.fna.fbcdn.net/v/t39.30808-6/339562382_6000293350066566_2663203292469041104_n.png?_nc_cat=1&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=pnOuJtVxGbsQ7kNvwGHHejC&_nc_oc=Adm7axhd1CAn5QscJMJMLAYx6hQSyQ5XIFZ-TKeXxzmg7RGH7exreSDB3jBzSAfUdXs&_nc_zt=23&_nc_ht=scontent.fsal14-1.fna&_nc_gid=QNmaaCPealzdfRk6WEnolA&oh=00_AfFQ_JU6_EgOeFtwfaBwItO_lEycpYbJAPp0Ic4FOboqHA&oe=681780A2",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(7, "Orange Chicken", "Crujiente pollo sazonado con salsa agridulce y picante", "https://www.pandaexpress.com.sv/sites/sv/files/styles/product_tab_2x/public/2023-03/Web-Site-PRG_ORANGE-CHICKEN.webp?itok=hvlXRa6M"),
            Dish(8, "Broccoli Beef", "Trozos de carne de res cocinados al wok con brócoli, salsa soya y jengibre.", "https://www.pandaexpress.com.sv/sites/sv/files/styles/product_tab_2x/public/2023-03/Web-Site-PRG_BROCCOLI-BEEF.webp?itok=yFJSAxcU")
        )
    ),
    Restaurant(
        id = 5,
        name = "Don Li Restaurant",
        description = "Frescura china servida al instante.",
        imageUrl = "https://scontent.fsal14-1.fna.fbcdn.net/v/t39.30808-6/348248548_913669219707824_3235253850831955168_n.png?_nc_cat=107&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=9XuN8k6rJoQQ7kNvwELeDJP&_nc_oc=AdmtSpOqFsRBJUfS3A_m31wacqvLgfOxXukr0s5bi4i5N_VTowUQfcdiNcuqwwrYDH4&_nc_zt=23&_nc_ht=scontent.fsal14-1.fna&_nc_gid=tL6IKh_yZ8JguZFfML9V_g&oh=00_AfEaZooF1ukZOO_H0M_tJhsFwpfDXMwO9DFaHvJKldOjVA&oe=6817791A",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(9, "Lomito de Res con Brocolí y Hongos", "Lomito de res salteado en salsa de ostras, acompañado de brocoli, cebolla, hongo shitake y champiñón.", "https://donli.com.sv/storage/products/December2023/02ODbdrymituzKSrOtuC-thumbnail.jpg"),
            Dish(10, "Panceta de Cerdo Spicy Teriyaki", "Panceta de cerdo en salsa teriyaki, acompañada de cebollin y servida sobre planca caliente.", "https://donli.com.sv/storage/products/October2023/wsn6WrcXHaMDnZp32FDV-thumbnail.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "China Wok",
        description = "Comer bien se siente bien!",
        imageUrl = "https://scontent.fsal14-1.fna.fbcdn.net/v/t39.30808-6/352801982_101397179656998_8007312213967145887_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=4A2-OfVQ_1QQ7kNvwGTTMfv&_nc_oc=Adn1wFtfhI_PKhfzH31kPVrqfz2s71KZhJ5Zm5V_PBEi8y0DJL581la9A4rVcJs6Kl0&_nc_zt=23&_nc_ht=scontent.fsal14-1.fna&_nc_gid=CYd2Ak_062Zy5-v2cT8UGA&oh=00_AfGNl9SBWHTBSvBKw1DhxvDa8jq1wmXz8bCFvI4zMlpWaQ&oe=68177F6E",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(11, "Camarones con vegetales", "Ricos camarones acompanados de brocoli, zanahora, cebolla roztizda y apio. Sasonados con salsa de ajonjolin", "https://www.chinawok.com.sv/static/media/images/products/webp/PRD_1010_SM_02-08-2023-11-57.webp?2.0.7"),
            Dish(12, "Pierna asada al ajo", "Trozos de pierna de cerdo finamente picados, sasonados con ajos, cebollin, especias y aceite de sesamo", "https://www.chinawok.com.sv/static/media/images/products/webp/PRD_1003_SM.webp?2.0.7")
        )
    ),
    Restaurant(
        id = 7,
        name = "Burger King",
        description = "La verdadera carne a la parrilla.",
        imageUrl = "https://scontent.fsal13-1.fna.fbcdn.net/v/t39.30808-6/178178598_3932451870198863_4730067510888218770_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=-grFn5AOMT0Q7kNvwGK_SMj&_nc_oc=AdkpmEXNIwd5k6-Wv9UVhpviE6cd33mzFR_uunyBq3sJsr53Bt0vXZqMYOHtUdpuCXg&_nc_zt=23&_nc_ht=scontent.fsal13-1.fna&_nc_gid=L81A-w4C6QVdBJh_V1gjQQ&oh=00_AfE6xsBZYNQf2CNuZ-NdMhQvTHFj5lRht86gBttyYnAoig&oe=68172BDF",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(13, "Spicy Whopper", "Jugosa carne a la parrilla, tomate, lechuga, cebolla y pepinillo, todo ello acompañado de la salsa Sriracha.", "https://cdn.sanity.io/images/czqk28jt/prod_bk_es/9499f7483d4cbc8891b4d459112a30a4f991f03e-1333x1333.png?w=750&q=40&fit=max&auto=format"),
            Dish(14, "Duo Bacon Cherddar", "Carne Whopper® a la parrilla y ahora también con pan brioche. Acompañado de deliciosa salsa de queso cheddar, dos lonchas de bacon, dos lonchas de queso cheddar, cebolla frita y tomate", "https://cdn.sanity.io/images/czqk28jt/prod_bk_es/a69ab5657e35e3705f5bb28f23d83e1298c5f31e-1333x1333.png?w=750&q=40&fit=max&auto=format")
        )
    ),
    Restaurant(
        id = 8,
        name = "McDonals",
        description = "Me encanta!",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcScU1N08_B0ZI760AVjGU-UsmWSw0yncIyPPg&s",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(15, "Big Mac", "La perfección: dos deliciosas tortas de carne 100% de res y salsa Big Mac, entre un pan de semillas de sésamo. Se completa con pepinillos, lechuga rallada, cebolla finamente picada y queso americano para una hamburguesa con un sabor sin igual.", "https://mcdonalds.com.sv/imagen/menu-products/1690993388_Bigmac_400x400px_BB.png"),
            Dish(16, "Cuarto de Libra", "Hamburguesa de 1/4 de libra de carne 100% de res deliciosamente jugosa. Se sazona con una pizca de sal y pimienta, acompañada de cebolla, kétchup, mostaza, dos rebanadas de queso cheddar amarillo en un pan de semillas de sésamo.", "https://mcdonalds.com.sv/imagen/menu-products/1690993415_CuartoLibra_400x400px_BB.png")
        )
    ),
    Restaurant(
        id = 9,
        name = "Pollo Campero",
        description = "En cualquier lugar y momento...",
        imageUrl = "https://scontent.fsal14-1.fna.fbcdn.net/v/t39.30808-6/436225864_821463440016751_7862006798957109277_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=_iVNJcSC63AQ7kNvwFveIVK&_nc_oc=AdniWI53Aqe2AacSv-ZG4JlK-3bQ41lXk-uPV_pLGGEOo_fE0egX8r2MIAb0Nw_EMn0&_nc_zt=23&_nc_ht=scontent.fsal14-1.fna&_nc_gid=r1cPodiu-HcWtiN21FssRA&oh=00_AfFZvpPcSNbAYr4XrzuG4nCiyu2PzGnKNfeHPMIL3NWeVg&oe=68178021",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(17, "Super Campero", "3 piezas de tierno y suave pollo frito acompanado de papas, ensalada, un pan y una bebida", "https://cdn-menu-us-east-1.tillster.com/pc-sv/8f524ec8-c687-43a4-8688-af3cddf5bb19.png"),
            Dish(18, "Menu de medallones", "7 delisiosas piezas de medallones 100% de pechuga de pollo, acompanado de papas fritas, aderezo, un pan y una bebida", "https://cdn-menu-us-east-1.tillster.com/pc-sv/1c794510-d3bf-4e11-8ecf-9bd199de2ece.png")
        )

    ),
    Restaurant(
        id = 10,
        name = "La Tecleña",
        description = "Pasteleria y Panaderia.",
        imageUrl = "https://scontent.fsal14-1.fna.fbcdn.net/v/t39.30808-6/449693140_867264642105287_6746771802772872105_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=fuyBEJ_7UCUQ7kNvwF06qgZ&_nc_oc=AdnYL2jxXwE2UeZa0II8LygioDWyBNTPqe1Ex4pwo7Xs11tmH1uwyoAdmEa63DgwcRc&_nc_zt=23&_nc_ht=scontent.fsal14-1.fna&_nc_gid=L5XW5cL-RZMuNgHklztBtA&oh=00_AfGVrVtTNiQd_i0WoxV-BP6do-l2QdWox8WjH4GIrbzR3w&oe=68178A09",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(19, "Mini Tres leches", "La receta clásica se prepara con un bizcocho sabor vainilla que se baña con una mezcla de leche condensada, leche evaporada y leche entera.", "https://lateclena.com/wp-content/uploads/2022/02/Chelito.jpg"),
            Dish(20, "Milhojas frances", "Deliciosas capas de hojaldre crujiente intercaladas con un relleno cremoso sabor caramelo, cubierto por delgadas almendras", "https://lateclena.com/wp-content/uploads/2022/02/Milhoja-de-caramelo.jpg")
        )
    )
)
