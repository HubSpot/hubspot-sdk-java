// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.AssociationSpec
import com.hubspot.sdk.models.crm.Filter
import com.hubspot.sdk.models.crm.FilterGroup
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.associations.AssociationCreateParams
import com.hubspot.sdk.models.crm.associations.AssociationDeleteParams
import com.hubspot.sdk.models.crm.associations.AssociationListParams
import com.hubspot.sdk.models.crm.associations.AssociationSearchParams
import com.hubspot.sdk.models.crm.associations.AssociationUpdateLabelsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssociationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        val batchResponsePublicDefaultAssociation =
            associationService.create(
                AssociationCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .fromObjectId("fromObjectId")
                    .toObjectType("toObjectType")
                    .toObjectId("toObjectId")
                    .build()
            )

        batchResponsePublicDefaultAssociation.validate()
    }

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
    fun updateLabels() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val associationService = client.crm().associations()

        val labelsBetweenObjectPair =
            associationService.updateLabels(
                AssociationUpdateLabelsParams.builder()
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
