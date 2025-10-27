// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptResponse
import java.util.function.Consumer

interface TranscriptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptService

    fun create(params: TranscriptCreateParams): TranscriptCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TranscriptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptCreateResponse

    /** @see create */
    fun create(
        transcriptCreateRequest: TranscriptCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptCreateResponse =
        create(
            TranscriptCreateParams.builder()
                .transcriptCreateRequest(transcriptCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(transcriptCreateRequest: TranscriptCreateRequest): TranscriptCreateResponse =
        create(transcriptCreateRequest, RequestOptions.none())

    fun delete(transcriptId: String) = delete(transcriptId, TranscriptDeleteParams.none())

    /** @see delete */
    fun delete(
        transcriptId: String,
        params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

    /** @see delete */
    fun delete(
        transcriptId: String,
        params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
    ) = delete(transcriptId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TranscriptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: TranscriptDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(transcriptId: String, requestOptions: RequestOptions) =
        delete(transcriptId, TranscriptDeleteParams.none(), requestOptions)

    fun get(transcriptId: String): TranscriptResponse =
        get(transcriptId, TranscriptGetParams.none())

    /** @see get */
    fun get(
        transcriptId: String,
        params: TranscriptGetParams = TranscriptGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptResponse =
        get(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

    /** @see get */
    fun get(
        transcriptId: String,
        params: TranscriptGetParams = TranscriptGetParams.none(),
    ): TranscriptResponse = get(transcriptId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TranscriptGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptResponse

    /** @see get */
    fun get(params: TranscriptGetParams): TranscriptResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(transcriptId: String, requestOptions: RequestOptions): TranscriptResponse =
        get(transcriptId, TranscriptGetParams.none(), requestOptions)

    /** A view of [TranscriptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/transcripts`, but is
         * otherwise the same as [TranscriptService.create].
         */
        @MustBeClosed
        fun create(params: TranscriptCreateParams): HttpResponseFor<TranscriptCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TranscriptCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            transcriptCreateRequest: TranscriptCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptCreateResponse> =
            create(
                TranscriptCreateParams.builder()
                    .transcriptCreateRequest(transcriptCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            transcriptCreateRequest: TranscriptCreateRequest
        ): HttpResponseFor<TranscriptCreateResponse> =
            create(transcriptCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/calling/transcripts/{transcriptId}`, but is otherwise the same as
         * [TranscriptService.delete].
         */
        @MustBeClosed
        fun delete(transcriptId: String): HttpResponse =
            delete(transcriptId, TranscriptDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            transcriptId: String,
            params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            transcriptId: String,
            params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
        ): HttpResponse = delete(transcriptId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TranscriptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TranscriptDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(transcriptId: String, requestOptions: RequestOptions): HttpResponse =
            delete(transcriptId, TranscriptDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/transcripts/{transcriptId}`, but is otherwise the same as
         * [TranscriptService.get].
         */
        @MustBeClosed
        fun get(transcriptId: String): HttpResponseFor<TranscriptResponse> =
            get(transcriptId, TranscriptGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            transcriptId: String,
            params: TranscriptGetParams = TranscriptGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptResponse> =
            get(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            transcriptId: String,
            params: TranscriptGetParams = TranscriptGetParams.none(),
        ): HttpResponseFor<TranscriptResponse> = get(transcriptId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TranscriptGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: TranscriptGetParams): HttpResponseFor<TranscriptResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            transcriptId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptResponse> =
            get(transcriptId, TranscriptGetParams.none(), requestOptions)
    }
}
