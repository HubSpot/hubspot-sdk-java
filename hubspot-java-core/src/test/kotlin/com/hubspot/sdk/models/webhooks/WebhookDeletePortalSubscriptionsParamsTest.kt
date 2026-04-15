// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeletePortalSubscriptionsParamsTest {

    @Test
    fun create() {
        WebhookDeletePortalSubscriptionsParams.builder().portalId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = WebhookDeletePortalSubscriptionsParams.builder().portalId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
