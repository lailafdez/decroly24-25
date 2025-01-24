const fondocolor = document.getElementById('boton2');
const mensaje1 = document.getElementById('boton1');
const texto = document.getElementById('mensaje');

fondocolor.addEventListener('click', () => {
    document.body.style.backgroundColor = 'black';
});

mensaje1.addEventListener('click', () => {
    mensaje.textContent = 'Hola soy laila';
});
