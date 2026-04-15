// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.batch

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.cms.BatchInputJsonNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateSitePagesParamsTest {

    @Test
    fun create() {
        BatchUpdateSitePagesParams.builder()
            .archived(true)
            .batchInputJsonNode(
                BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchUpdateSitePagesParams.builder()
                .archived(true)
                .batchInputJsonNode(
                    BatchInputJsonNode.builder()
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchUpdateSitePagesParams.builder()
                .batchInputJsonNode(
                    BatchInputJsonNode.builder()
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchUpdateSitePagesParams.builder()
                .archived(true)
                .batchInputJsonNode(
                    BatchInputJsonNode.builder()
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchUpdateSitePagesParams.builder()
                .batchInputJsonNode(
                    BatchInputJsonNode.builder()
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()
            )
    }
}
