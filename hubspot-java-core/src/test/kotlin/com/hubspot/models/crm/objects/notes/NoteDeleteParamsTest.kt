// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.notes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NoteDeleteParamsTest {

    @Test
    fun create() {
        NoteDeleteParams.builder().noteId("noteId").build()
    }

    @Test
    fun pathParams() {
        val params = NoteDeleteParams.builder().noteId("noteId").build()

        assertThat(params._pathParam(0)).isEqualTo("noteId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
