// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.objects.PublicAssociationsForObject
import com.hubspot.models.crm.objects.SimplePublicObjectInput
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.tasks.TaskGetParams
import com.hubspot.models.crm.objects.tasks.TaskUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TaskServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val simplePublicObjectFuture =
            taskServiceAsync.create(
                SimplePublicObjectInputForCreate.builder()
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
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val simplePublicObjectFuture =
            taskServiceAsync.update(
                TaskUpdateParams.builder()
                    .taskId("taskId")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val pageFuture = taskServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val future = taskServiceAsync.delete("taskId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val simplePublicObjectWithAssociationsFuture =
            taskServiceAsync.get(
                TaskGetParams.builder()
                    .taskId("taskId")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val collectionResponseWithTotalSimplePublicObjectFuture =
            taskServiceAsync.search(
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
}
