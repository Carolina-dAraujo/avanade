# API de Biblioteca
API RESTful para gerenciamento de biblioteca.

## Diagrama de Classes:
```mermaid
classDiagram
    class Usuario {
        +int id
        +String nome
        +String email
        +String senha
        +bool ativo
    }

    class Livro {
        +int id
        +String titulo
        +String autor
        +int ano_publicacao
        +String genero
        +int quantidade_disponivel
    }

    class Emprestimo {
        +int id
        +DateTime data_emprestimo
        +DateTime data_devolucao
        +Usuario usuario
        +Livro livro
        +bool ativo
    }

    class Pagamento {
        +int id
        +float valor
        +DateTime data_pagamento
        +Usuario usuario
        +bool pago
    }

    class Assinatura {
        +int id
        +String tipo
        +DateTime data_inicio
        +DateTime data_fim
        +Usuario usuario
    }

    class Notificacao {
        +int id
        +String mensagem
        +DateTime data_envio
        +Usuario usuario
        +bool lida
    }

    Usuario "1" -- "*" Emprestimo: realiza
    Usuario "1" -- "*" Pagamento: efetua
    Usuario "1" -- "*" Assinatura: possui
    Usuario "1" -- "*" Notificacao: recebe
    Livro "1" -- "*" Emprestimo: está_em
