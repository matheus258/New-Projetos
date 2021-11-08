function test() {
  document.getElementById('bla').innerHTML = '<h1>ok<h1>';
}

function test1() {
  document.getElementById('bla').innerHTML = '<h1>Bom dia<h1>';
}
function test2() {
  document.getElementById('bla').innerHTML = '<h1>Boa tarde<h1>';
}

export default {
  test,
  test1,
  test2,
};
