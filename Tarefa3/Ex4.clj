(ns Ex4)
;; ENUNCIADO
; função que recebe preço e quantidade de um produto 
; se a quantidade for maior ou igual a 10, aplicar
; desconto de 10% no proço do produto
; exibir: preço informado, quantidade comprada e valor total

(defn calcula-compra [preco quantidade]
  (let [desconto (if (>= quantidade 10) 0.10 0.0)
        preco-final (* preco (- 1 desconto))
        total (* preco-final quantidade)]
    (println "Preço informado:" preco)
    (println "Quantidade comprada:" quantidade)
    (when (>= quantidade 10)
      (println "Desconto aplicado: 10%"))
    (println "Valor total da compra:" total)))

;; testando
(calcula-compra  1250.70 4)
(calcula-compra 450.50 15)