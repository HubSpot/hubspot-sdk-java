// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.actors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActorGetParamsTest {

    @Test
    fun create() {
        ActorGetParams.builder().actorId("actorId").build()
    }

    @Test
    fun pathParams() {
        val params = ActorGetParams.builder().actorId("actorId").build()

        assertThat(params._pathParam(0)).isEqualTo("actorId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
