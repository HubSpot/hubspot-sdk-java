// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerclients.batch

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchBatchGetParamsTest {

    @Test
    fun create() {
        BatchBatchGetParams.builder()
            .archived(true)
            .batchReadInputSimplePublicObjectId(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("id").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .idProperty("idProperty")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchBatchGetParams.builder()
                .archived(true)
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .idProperty("idProperty")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchBatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchBatchGetParams.builder()
                .archived(true)
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .idProperty("idProperty")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("id").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .idProperty("idProperty")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchBatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("id").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )
    }
}
