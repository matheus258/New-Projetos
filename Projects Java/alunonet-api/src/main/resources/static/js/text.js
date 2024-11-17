const texts = [
  "Bem-vindo ao Sistema de Gerenciamento de Alunos.",
  "Organize, simplifique e transforme sua gestão educacional.",
  "Descubra soluções inovadoras para sua instituição.",
  "Nosso sistema centraliza todas as informações importantes",
  "Conectando alunos, professores e gestores em um único lugar."
];
const typingSpeed = 100; // Velocidade de digitação
const delayBetweenTexts = 2000; // Pausa entre os textos

const dynamicTextElement = document.getElementById("dynamic-text");
let textIndex = 0;
let charIndex = 0;

function typeText() {
  if (charIndex < texts[textIndex].length) {
    dynamicTextElement.textContent += texts[textIndex].charAt(charIndex);
    charIndex++;
    setTimeout(typeText, typingSpeed);
  } else {
    setTimeout(eraseText, delayBetweenTexts);
  }
}

function eraseText() {
  if (charIndex > 0) {
    dynamicTextElement.textContent = texts[textIndex].substring(0, charIndex - 1);
    charIndex--;
    setTimeout(eraseText, typingSpeed / 2);
  } else {
    textIndex = (textIndex + 1) % texts.length; // Muda para o próximo texto
    setTimeout(typeText, typingSpeed);
  }
}

// Inicia a animação
typeText();
