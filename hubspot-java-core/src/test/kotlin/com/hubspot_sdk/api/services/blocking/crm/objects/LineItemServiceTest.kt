// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInput
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemGetParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        val createdResponseSimplePublicObject =
            lineItemService.create(
                SimplePublicObjectInputForCreate.builder()
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("37295").build())
                            .addType(
                                AssociationSpec1.builder()
                                    .associationCategory(
                                        AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        createdResponseSimplePublicObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        val simplePublicObject =
            lineItemService.update(
                LineItemUpdateParams.builder()
                    .lineItemId("lineItemId")
                    .idProperty("idProperty")
                    .simplePublicObjectInput(
                        SimplePublicObjectInput.builder()
                            .properties(
                                SimplePublicObjectInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        simplePublicObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        val page = lineItemService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        lineItemService.delete("lineItemId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        val simplePublicObjectWithAssociations =
            lineItemService.get(
                LineItemGetParams.builder()
                    .lineItemId("lineItemId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val lineItemService = client.crm().objects().lineItems()

        val collectionResponseWithTotalSimplePublicObject =
            lineItemService.search(
                PublicObjectSearchRequest.builder()
                    .after("after")
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.EQ)
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
                    .query("query")
                    .addSort("string")
                    .build()
            )

        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
