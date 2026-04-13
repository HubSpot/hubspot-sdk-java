// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.listings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListingDeleteParamsTest {

    @Test
    fun create() {
        ListingDeleteParams.builder().listingId("listingId").build()
    }

    @Test
    fun pathParams() {
        val params = ListingDeleteParams.builder().listingId("listingId").build()

        assertThat(params._pathParam(0)).isEqualTo("listingId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
