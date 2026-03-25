// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteAssociationsParams
import com.hubspot_sdk.api.models.crm.associations.AssociationUpdateAssociationLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociations() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationServiceAsync = client.crm().associations()

        val future =
            associationServiceAsync.deleteAssociations(
                AssociationDeleteAssociationsParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestHighUsageReport() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationServiceAsync = client.crm().associations()

        val reportCreationResponseFuture = associationServiceAsync.requestHighUsageReport(0)

        val reportCreationResponse = reportCreationResponseFuture.get()
        reportCreationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAssociationLabels() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationServiceAsync = client.crm().associations()

        val labelsBetweenObjectPairFuture =
            associationServiceAsync.updateAssociationLabels(
                AssociationUpdateAssociationLabelsParams.builder()
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

        val labelsBetweenObjectPair = labelsBetweenObjectPairFuture.get()
        labelsBetweenObjectPair.validate()
    }
}
