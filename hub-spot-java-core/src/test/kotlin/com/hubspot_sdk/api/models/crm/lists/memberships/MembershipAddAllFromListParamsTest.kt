// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.memberships

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MembershipAddAllFromListParamsTest {

    @Test
    fun create() {
        MembershipAddAllFromListParams.builder()
            .listId("listId")
            .sourceListId("sourceListId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MembershipAddAllFromListParams.builder()
                .listId("listId")
                .sourceListId("sourceListId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        assertThat(params._pathParam(1)).isEqualTo("sourceListId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
