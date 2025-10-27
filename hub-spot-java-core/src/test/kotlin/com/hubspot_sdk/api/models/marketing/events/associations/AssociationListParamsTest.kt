// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.associations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationListParamsTest {

    @Test
    fun create() {
        AssociationListParams.builder().marketingEventId("marketingEventId").build()
    }

    @Test
    fun pathParams() {
        val params = AssociationListParams.builder().marketingEventId("marketingEventId").build()

        assertThat(params._pathParam(0)).isEqualTo("marketingEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
