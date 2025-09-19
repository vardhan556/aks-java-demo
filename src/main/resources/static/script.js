async function fetchHello() {
    try {
        const res = await fetch('/hello');
        const text = await res.text();
        document.getElementById('response').innerText = text;
    } catch (error) {
        document.getElementById('response').innerText = "Error fetching hello!";
    }
}
