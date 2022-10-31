function verifica() {
    var n1 = document.getElementById('n1').value;
    var n2 = document.getElementById('n2').value;
    var n3 = document.getElementById('n3').value;
    var n4 = document.getElementById('n4').value;
    var n5 = document.getElementById('n5').value;
    var n6 = document.getElementById('n6').value;
    var n7 = document.getElementById('n7').value;
    var n8 = document.getElementById('n8').value;
    var n9 = document.getElementById('n9').value;
    if (n1!=1 || n2!=2 || n3!=3 || n4!=4 || n5!=5 || n6!=6 || n7!=7 || n8!=8 || n9!=9 ) {
        alert('HAI SBAGLIATO!!! RICOMINCIA');
    } else {
        alert('HAI VINTO!!! Puoi proseguire');
        location.href = "naming.html";
    }
}