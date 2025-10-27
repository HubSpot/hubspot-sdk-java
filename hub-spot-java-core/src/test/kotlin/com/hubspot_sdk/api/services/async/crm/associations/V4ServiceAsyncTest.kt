// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateDefaultAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListAssociationsByTypeParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateAssociationLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V4ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createDefaultAssociation() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val v4ServiceAsync = client.crm().associations().v4()

        val batchResponsePublicDefaultAssociationFuture =
            v4ServiceAsync.createDefaultAssociation(
                V4CreateDefaultAssociationParams.builder()
                    .fromObjectType("fromObjectType")
                    .fromObjectId("fromObjectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        val batchResponsePublicDefaultAssociation =
            batchResponsePublicDefaultAssociationFuture.get()
        batchResponsePublicDefaultAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAssociation() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val v4ServiceAsync = client.crm().associations().v4()

        val future =
            v4ServiceAsync.deleteAssociation(
                V4DeleteAssociationParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAssociationsByType() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val v4ServiceAsync = client.crm().associations().v4()

        val collectionResponseMultiAssociatedObjectWithLabelFuture =
            v4ServiceAsync.listAssociationsByType(
                V4ListAssociationsByTypeParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .after("after")
                    .limit(0)
                    .build()
            )

        val collectionResponseMultiAssociatedObjectWithLabel =
            collectionResponseMultiAssociatedObjectWithLabelFuture.get()
        collectionResponseMultiAssociatedObjectWithLabel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAssociationLabels() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val v4ServiceAsync = client.crm().associations().v4()

        val createdResponseLabelsBetweenObjectPairFuture =
            v4ServiceAsync.updateAssociationLabels(
                V4UpdateAssociationLabelsParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .addBody(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )

        val createdResponseLabelsBetweenObjectPair =
            createdResponseLabelsBetweenObjectPairFuture.get()
        createdResponseLabelsBetweenObjectPair.validate()
    }
}
