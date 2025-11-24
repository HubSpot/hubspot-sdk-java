// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.actors

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActorGetParamsTest {

    @Test
    fun create() {
        ActorGetParams.builder().actorId("actorId").property("property").build()
    }

    @Test
    fun pathParams() {
        val params = ActorGetParams.builder().actorId("actorId").build()

        assertThat(params._pathParam(0)).isEqualTo("actorId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ActorGetParams.builder().actorId("actorId").property("property").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("property", "property").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActorGetParams.builder().actorId("actorId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
