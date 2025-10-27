// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.inboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxGetParamsTest {

    @Test
    fun create() {
        InboxGetParams.builder().inboxId("inboxId").build()
    }

    @Test
    fun pathParams() {
        val params = InboxGetParams.builder().inboxId("inboxId").build()

        assertThat(params._pathParam(0)).isEqualTo("inboxId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
