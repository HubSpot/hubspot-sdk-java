// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors.batch

import com.hubspot.core.JsonValue
import com.hubspot.core.http.QueryParams
import com.hubspot.models.cms.BatchInputJsonNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateParamsTest {

    @Test
    fun create() {
        BatchUpdateParams.builder()
            .archived(true)
            .batchInputJsonNode(
                BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
