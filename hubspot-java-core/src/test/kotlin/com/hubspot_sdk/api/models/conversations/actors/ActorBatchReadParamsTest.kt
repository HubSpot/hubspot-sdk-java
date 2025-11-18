// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.actors

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActorBatchReadParamsTest {

    @Test
    fun create() {
        ActorBatchReadParams.builder()
            .property("property")
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActorBatchReadParams.builder()
                .property("property")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("property", "property").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ActorBatchReadParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ActorBatchReadParams.builder()
                .property("property")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActorBatchReadParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
