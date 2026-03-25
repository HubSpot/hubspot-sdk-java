// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.PublicAssociationsForObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.invoices.InvoiceGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvoiceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val batchResponseSimplePublicObjectFuture =
            invoiceServiceAsync.create(
                BatchInputSimplePublicObjectBatchInputForCreate.builder()
                    .addInput(
                        SimplePublicObjectBatchInputForCreate.builder()
                            .addAssociation(
                                PublicAssociationsForObject.builder()
                                    .to(PublicObjectId.builder().id("id").build())
                                    .addType(
                                        AssociationSpec.builder()
                                            .associationCategory(
                                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                            )
                                            .associationTypeId(0)
                                            .build()
                                    )
                                    .build()
                            )
                            .properties(
                                SimplePublicObjectBatchInputForCreate.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val batchResponseSimplePublicObjectFuture =
            invoiceServiceAsync.update(
                BatchInputSimplePublicObjectBatchInput.builder()
                    .addInput(
                        SimplePublicObjectBatchInput.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("my_unique_property_name")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val pageFuture = invoiceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val future =
            invoiceServiceAsync.delete(
                BatchInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val batchResponseSimplePublicObjectFuture =
            invoiceServiceAsync.get(
                InvoiceGetParams.builder()
                    .archived(true)
                    .batchReadInputSimplePublicObjectId(
                        BatchReadInputSimplePublicObjectId.builder()
                            .addInput(SimplePublicObjectId.builder().id("430001").build())
                            .addProperty("string")
                            .addPropertiesWithHistory("string")
                            .idProperty("idProperty")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicObject = batchResponseSimplePublicObjectFuture.get()
        batchResponseSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            invoiceServiceAsync.search(
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

        val collectionResponseWithTotalSimplePublicObject =
            collectionResponseWithTotalSimplePublicObjectFuture.get()
        collectionResponseWithTotalSimplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val invoiceServiceAsync = client.crm().objects().invoices()

        val batchResponseSimplePublicUpsertObjectFuture =
            invoiceServiceAsync.upsert(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("idProperty")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )

        val batchResponseSimplePublicUpsertObject =
            batchResponseSimplePublicUpsertObjectFuture.get()
        batchResponseSimplePublicUpsertObject.validate()
    }
}
