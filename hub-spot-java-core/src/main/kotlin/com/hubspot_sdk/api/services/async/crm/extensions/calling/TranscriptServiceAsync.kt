// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TranscriptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptServiceAsync

    fun create(params: TranscriptCreateParams): CompletableFuture<TranscriptCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TranscriptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptCreateResponse>

    /** @see create */
    fun create(
        transcriptCreateRequest: TranscriptCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptCreateResponse> =
        create(
            TranscriptCreateParams.builder()
                .transcriptCreateRequest(transcriptCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        transcriptCreateRequest: TranscriptCreateRequest
    ): CompletableFuture<TranscriptCreateResponse> =
        create(transcriptCreateRequest, RequestOptions.none())

    fun delete(transcriptId: String): CompletableFuture<Void?> =
        delete(transcriptId, TranscriptDeleteParams.none())

    /** @see delete */
    fun delete(
        transcriptId: String,
        params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

    /** @see delete */
    fun delete(
        transcriptId: String,
        params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(transcriptId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TranscriptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TranscriptDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(transcriptId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(transcriptId, TranscriptDeleteParams.none(), requestOptions)

    fun get(transcriptId: String): CompletableFuture<TranscriptResponse> =
        get(transcriptId, TranscriptGetParams.none())

    /** @see get */
    fun get(
        transcriptId: String,
        params: TranscriptGetParams = TranscriptGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptResponse> =
        get(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

    /** @see get */
    fun get(
        transcriptId: String,
        params: TranscriptGetParams = TranscriptGetParams.none(),
    ): CompletableFuture<TranscriptResponse> = get(transcriptId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TranscriptGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptResponse>

    /** @see get */
    fun get(params: TranscriptGetParams): CompletableFuture<TranscriptResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        transcriptId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TranscriptResponse> =
        get(transcriptId, TranscriptGetParams.none(), requestOptions)

    /**
     * A view of [TranscriptServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/transcripts`, but is
         * otherwise the same as [TranscriptServiceAsync.create].
         */
        fun create(
            params: TranscriptCreateParams
        ): CompletableFuture<HttpResponseFor<TranscriptCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TranscriptCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptCreateResponse>>

        /** @see create */
        fun create(
            transcriptCreateRequest: TranscriptCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptCreateResponse>> =
            create(
                TranscriptCreateParams.builder()
                    .transcriptCreateRequest(transcriptCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            transcriptCreateRequest: TranscriptCreateRequest
        ): CompletableFuture<HttpResponseFor<TranscriptCreateResponse>> =
            create(transcriptCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/calling/transcripts/{transcriptId}`, but is otherwise the same as
         * [TranscriptServiceAsync.delete].
         */
        fun delete(transcriptId: String): CompletableFuture<HttpResponse> =
            delete(transcriptId, TranscriptDeleteParams.none())

        /** @see delete */
        fun delete(
            transcriptId: String,
            params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

        /** @see delete */
        fun delete(
            transcriptId: String,
            params: TranscriptDeleteParams = TranscriptDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(transcriptId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TranscriptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TranscriptDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            transcriptId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(transcriptId, TranscriptDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/transcripts/{transcriptId}`, but is otherwise the same as
         * [TranscriptServiceAsync.get].
         */
        fun get(transcriptId: String): CompletableFuture<HttpResponseFor<TranscriptResponse>> =
            get(transcriptId, TranscriptGetParams.none())

        /** @see get */
        fun get(
            transcriptId: String,
            params: TranscriptGetParams = TranscriptGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>> =
            get(params.toBuilder().transcriptId(transcriptId).build(), requestOptions)

        /** @see get */
        fun get(
            transcriptId: String,
            params: TranscriptGetParams = TranscriptGetParams.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>> =
            get(transcriptId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TranscriptGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>>

        /** @see get */
        fun get(
            params: TranscriptGetParams
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            transcriptId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>> =
            get(transcriptId, TranscriptGetParams.none(), requestOptions)
    }
}
