// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteAssociationsParams
import com.hubspot_sdk.api.models.crm.associations.AssociationUpdateAssociationLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAssociations() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationService = client.crm().associations()

        associationService.deleteAssociations(
            AssociationDeleteAssociationsParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestHighUsageReport() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationService = client.crm().associations()

        val reportCreationResponse = associationService.requestHighUsageReport(0)

        reportCreationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAssociationLabels() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val associationService = client.crm().associations()

        val labelsBetweenObjectPair =
            associationService.updateAssociationLabels(
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

        labelsBetweenObjectPair.validate()
    }
}
