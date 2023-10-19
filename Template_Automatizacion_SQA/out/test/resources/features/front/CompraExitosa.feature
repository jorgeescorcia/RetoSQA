# language: es

  Característica: Proceso de Compra en la Pagina Sanangel

    Escenario:  Compra exitosa en Swaglabs
      Dado que el usuario se encuentra en la pagina principal de Sanangel
      Y el usuario se autentica
      Cuando el usuario añade varios producto al carrito de compra
      Y diligencias sus datos
      Entonces  debe aparecer el mensaje de compra exitosa "Thank you for your order!"