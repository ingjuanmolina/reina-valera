const navbar = document.querySelector('.nav');
const navbarHTML = `

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="/home">Inicio</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link" href="/books">Libros</a>
                <a class="nav-item nav-link" href="/search">Buscar</a>
            </div>
        </div>
    </nav>
`;
navbar.insertAdjacentHTML('beforebegin', navbarHTML);