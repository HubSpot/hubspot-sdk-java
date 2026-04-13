// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.AssociationSpec
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.associations.AssociationDeleteParams
import com.hubspot.models.crm.associations.AssociationListParams
import com.hubspot.models.crm.associations.AssociationSearchParams
import com.hubspot.models.crm.associations.AssociationUpdateAssociationLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        val page =
            associationService.list(
                AssociationListParams.builder()
                    .objectType("objectType")
                    .objectId("objectId")
                    .toObjectType("toObjectType")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        associationService.delete(
            AssociationDeleteParams.builder()
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        val reportCreationResponse = associationService.requestHighUsageReport(0)

        reportCreationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        val collectionResponseWithTotalSimplePublicObject =
            associationService.search(
                AssociationSearchParams.builder()
                    .objectType("objectType")
                    .publicObjectSearchRequest(
                        PublicObjectSearchRequest.builder()
                            .after("after")
                            .addFilterGroup(
                                FilterGroup.builder()
                                    .addFilter(
                                        Filter.builder()
                                            .operator(Filter.Operator.BETWEEN)
                                            .propertyName("propertyName")
                                            .highValue("highValue")
                                            .value("value")
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .limit(0)
                            .addProperty("string")
                            .addSort("string")
                            .query("query")
                            .build()
                    )
                    .build()
            )

        collectionResponseWithTotalSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAssociationLabels() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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
