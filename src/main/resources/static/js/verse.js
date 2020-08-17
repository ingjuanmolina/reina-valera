let elementPassed;

function copyText(element) {
    element.classList.remove('badge-primary');
    element.classList.add('badge-success');
    elementPassed = element;
    console.log('elementPassed', elementPassed);
    const str = element.innerText;
    console.log('str', str);
    const el = document.createElement('textarea');
    el.value = str;
    document.body.appendChild(el);
    el.select();
    document.execCommand('copy');
    document.body.removeChild(el);
}