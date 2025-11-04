// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInput
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpec1
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentGetParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommercePaymentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val createdResponseSimplePublicObjectFuture =
            commercePaymentServiceAsync.create(
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

        val createdResponseSimplePublicObject = createdResponseSimplePublicObjectFuture.get()
        createdResponseSimplePublicObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val simplePublicObjectFuture =
            commercePaymentServiceAsync.update(
                CommercePaymentUpdateParams.builder()
                    .commercePaymentId("commercePaymentId")
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

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val pageFuture = commercePaymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val future = commercePaymentServiceAsync.delete("commercePaymentId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val simplePublicObjectWithAssociationsFuture =
            commercePaymentServiceAsync.get(
                CommercePaymentGetParams.builder()
                    .commercePaymentId("commercePaymentId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        val simplePublicObjectWithAssociations = simplePublicObjectWithAssociationsFuture.get()
        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val commercePaymentServiceAsync = client.crm().objects().commercePayments()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            commercePaymentServiceAsync.search(
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

        val collectionResponseWithTotalSimplePublicObject =
            collectionResponseWithTotalSimplePublicObjectFuture.get()
        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
