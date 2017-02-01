<%-- 
    Document   : ListeCommandes
    Created on : 30 janv. 2017, 15:36:41
    Author     : gauthier
--%>

<jsp:include page="Menu.jsp" />


<section id="bodyAfficheCommande">
    <div class="container ">
        <div class="row">
            <table class="table">
                <thead>
                    <th>Numéro de commande</th>
                    <th>Date de commande</th>
                    <th>Etat Commande</th>
                    <th>Date de livraison commande</th>
                    <th>Nom fournisseur</th> 

                </thead>

                <tbody>
                    <c:forEach items="${ commandes }" var="commande" varStatus="status">     
                        <tr>
                            <td><c:out value="${ commande.id_commande }" /></td>
                            <td><c:out value="${ commande.dateCommandeString }" /></td>
                            <td><c:out value="${ commande.etatCommande }" /></td>
                            <td><c:out value="${ commande.dateLivraisonCommandeString }" /></td>
                            <td><c:out value="${ commande.fournisseur.nomEntreprise }" /></td>
                        </tr>
                    </c:forEach>  
                </tbody>
            </table>
        </div>
    </div>

</section>
