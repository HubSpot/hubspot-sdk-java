// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorUpdateBatchParamsTest {

    @Test
    fun create() {
        AuthorUpdateBatchParams.builder()
            .archived(true)
            .batchInputJsonNode(
                BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuthorUpdateBatchParams.builder()
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
            AuthorUpdateBatchParams.builder()
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
            AuthorUpdateBatchParams.builder()
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
            AuthorUpdateBatchParams.builder()
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
