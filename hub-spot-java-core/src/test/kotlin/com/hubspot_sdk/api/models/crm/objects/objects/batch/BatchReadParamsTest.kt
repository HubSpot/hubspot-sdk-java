// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.objects.batch

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReadParamsTest {

    @Test
    fun create() {
        BatchReadParams.builder()
            .objectType("objectType")
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
    fun pathParams() {
        val params =
            BatchReadParams.builder()
                .objectType("objectType")
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("id").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BatchReadParams.builder()
                .objectType("objectType")
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
            BatchReadParams.builder()
                .objectType("objectType")
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
            BatchReadParams.builder()
                .objectType("objectType")
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
            BatchReadParams.builder()
                .objectType("objectType")
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
