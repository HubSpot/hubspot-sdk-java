// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import com.hubspot_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileOperationReplaceParamsTest {

    @Test
    fun create() {
        FileOperationReplaceParams.builder()
            .fileId("321669910225")
            .charsetHunch("charsetHunch")
            .file("some content".byteInputStream())
            .options("options")
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileOperationReplaceParams.builder().fileId("321669910225").build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FileOperationReplaceParams.builder()
                .fileId("321669910225")
                .charsetHunch("charsetHunch")
                .file("some content".byteInputStream())
                .options("options")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "charsetHunch" to MultipartField.of("charsetHunch"),
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "options" to MultipartField.of("options"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileOperationReplaceParams.builder().fileId("321669910225").build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
