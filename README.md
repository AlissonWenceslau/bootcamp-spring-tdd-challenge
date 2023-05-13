# Teste Driven Development Challenge

Este é um desafio proposto pela DevSuperior referente ao capítulo **02.Testes Automatizados**

![Untitled.png](img/Untitled.png)

## Enunciado

![Untitled](img/Untitled%201.png)

Implemente as funcionalidades necessárias para que os seguintes testes:

Classe de teste **CityControllerIT**

![Untitled](img/Untitled%202.png)

![Untitled](img/Untitled%203.png)

![Untitled](img/Untitled%204.png)

---

Classe de teste **EventControllerIT**

![Untitled](img/Untitled%205.png)

![Untitled](img/Untitled%206.png)

---

O projeto foi desenvolvido no padrão de camadas, onde a implementação começa na camada service e vai até a camada controller, veja abaixo as implementações feitas

| Pacote | Classe | Métodos |
| --- | --- | --- |
| Services | CityService | findAll, insert, delete |
| Services | EventService | update, copyToEntity |
| Controllers | CityController | findAll, insert,  delete |
| Controllers | EventController | update |

## Implementation services

![Untitled](img/Untitled%207.png)

![Untitled](img/Untitled%208.png)

## Implementation controllers

![Untitled](img/Untitled%209.png)

![Untitled](img/Untitled%2010.png)

Ao total foram 7 testes e 6 implementações baseados em testes de integração!