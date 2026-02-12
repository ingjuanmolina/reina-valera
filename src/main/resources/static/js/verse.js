function copyText(element) {
    element.classList.remove('badge-primary');
    element.classList.add('badge-success');
    const str = element.innerText;
    const el = document.createElement('textarea');
    el.value = str;
    document.body.appendChild(el);
    el.select();
    document.execCommand('copy');
    document.body.removeChild(el);
}