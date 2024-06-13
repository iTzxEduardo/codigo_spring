<div align=center> 
  <h1> ⚙🛠🎯 Gestão de Patrimônios e Estoque 🎯🛠⚙  </h1>
</div> 

## Visão Geral do Projeto

O projeto Senai-Stock foi desenvolvido com o objetivo de criar um sistema de controle de estoque e patrimônio para uma escola, dividido entre patrimônio e itens consumíveis. O sistema permite a gestão eficiente de recursos, associando cada item a uma sala específica e designando um responsável por cada sala. Também facilita a verificação periódica e o registro de transferências e manutenção de patrimônio.

## [Plano de Negócios](https://github.com/senai-stock/stock_project/blob/main/plano%20de%20neg%C3%B3cios.txt)


## Objetivos:
<ul>
  <li>Patrimônio dividido por sala</li>
  <li>Os objetos dentro da sala pertencem ao patrimônio da sala</li>
  <li>Uma pessoa é responsável pelo patrimônio da sala, 1 por sala, professor etc</li>
  <li>Verificação feita 1 vez por ano</li>
  <li>Cada patrimônio mesmo se der problema não pode ser jogado fora</li>
  <li>Cada patrimônio tem um número</li>
  <li>Verificação do tempo de manutenção, formatação, requisitos da máquina, sistemas operacional ativo, chave etc.</li>
  <li>Campo para movimentação de patrimônio</li>
  <li>Registro de transferências</li>
  <li>Registro de transferências de patrimônio deve ser aprovado por um gestor um cargo acima</li>
  <li>Itens consumiveis</li>
  <li>Separar por setor os itens consumiveis</li>
</ul>

 
## 🛠 Linguagem
- **Spring Boot**: O Spring Boot é um framework `Java` que simplifica o desenvolvimento de aplicativos, enquanto o `JPA` oferece uma maneira fácil de acessar e manipular dados em bancos de dados relacionais, facilitando o desenvolvimento de aplicativos.
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)
  

---
<details><summary>
<h2> Modelo Conceitual: </h2>
</summary>
<div align=center> 
  
![Modelo de Negócios](/image-database.png)
</div> 
</details>


<details><summary>
  
## API RESTFUL
</summary>

### Responsaveis

  Method Get:
![Get-Responsaveis](requisitions_api_images/responsaveis/get-responsaveis.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/responsaveis/post-responsaveis.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/responsaveis/put-responsaveis.png)

  Method Delete:
![Modelo de Negócios](requisitions_api_images/responsaveis/delete-responsaveis.png)

---
### Salas

  Method Get:
![Modelo de Negócios](requisitions_api_images/salas/get-salas.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/salas/post-salas.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/salas/put-salas.png)

---
### Areas

  Method Get:
![Modelo de Negócios](requisitions_api_images/areas/get-areas.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/areas/post-areas.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/areas/put-areas.png)

---
### Cargos

  Method Get:
![Modelo de Negócios](requisitions_api_images/cargos/get-cargos.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/cargos/post-cargos.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/cargos/put-cargos.png)

---
### Estoque

  Method Get:
![Modelo de Negócios](requisitions_api_images/estoque/get-estoque.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/estoque/post-estoque.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/estoque/put-estoque.png)

---
### Transferências

  Method Get:
![Modelo de Negócios](requisitions_api_images/transferencias/get-transferencias.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/transferencias/post-transferencias.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/transferencias/put-transferencias.png)

---
### Patrimônios

  Method Get:
![Modelo de Negócios](requisitions_api_images/patrimonios/get-patrimonios.png)

  Method Post:
![Modelo de Negócios](requisitions_api_images/patrimonios/post-patrimonios.png)

  Method Put:
![Modelo de Negócios](requisitions_api_images/patrimonios/put-patrimonios.png)

</details>

---

## FrontEnd 

- [Pasta com Imagens](https://github.com/senai-stock/stock_project/tree/main/front-images)
- [Imagens FrontEnd](https://github.com/senai-stock/codigo_spring/blob/FrontEnd-Edu/README.md)

---

## Conclusão
A experiência de criar o projeto Senai-Stock foi enriquecedora, pois envolveu a aplicação de várias tecnologias e práticas de desenvolvimento em um cenário prático. Desde a definição do modelo de dados até a implementação de serviços e controladores, cada etapa contribuiu para a construção de um sistema completo e funcional. O resultado final é uma aplicação robusta que atende aos requisitos do controle de patrimônio e estoque de uma escola, facilitando a gestão e o rastreamento de recursos de maneira eficiente.

---
## Autores

- [@hunter7210](https://www.github.com/hunter7210)

- [@rafaelmoura23](https://www.github.com/rafaelmoura23)

- [@Edu1Sinico](https://www.github.com/Edu1Sinico)
