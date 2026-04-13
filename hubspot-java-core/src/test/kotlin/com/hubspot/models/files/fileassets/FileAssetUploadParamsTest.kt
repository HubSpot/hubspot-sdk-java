// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files.fileassets

import com.hubspot.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetUploadParamsTest {

    @Test
    fun create() {
        FileAssetUploadParams.builder()
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
            FileAssetUploadParams.builder()
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
        val params = FileAssetUploadParams.builder().build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
