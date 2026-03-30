// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.hubspot_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadParamsTest {

    @Test
    fun create() {
        FileUploadParams.builder()
            .charsetHunch("charsetHunch")
            .file("Example data".byteInputStream())
            .fileName("fileName")
            .folderId("folderId")
            .folderPath("folderPath")
            .options("options")
            .build()
    }

    @Test
    fun body() {
        val params =
            FileUploadParams.builder()
                .charsetHunch("charsetHunch")
                .file("Example data".byteInputStream())
                .fileName("fileName")
                .folderId("folderId")
                .folderPath("folderPath")
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
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "fileName" to MultipartField.of("fileName"),
                        "folderId" to MultipartField.of("folderId"),
                        "folderPath" to MultipartField.of("folderPath"),
                        "options" to MultipartField.of("options"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileUploadParams.builder().build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
