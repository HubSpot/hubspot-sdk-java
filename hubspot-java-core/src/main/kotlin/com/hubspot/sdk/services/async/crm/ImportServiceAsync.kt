// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.ActionResponse
import com.hubspot.sdk.models.crm.imports.ImportCancelParams
import com.hubspot.sdk.models.crm.imports.ImportCreateParams
import com.hubspot.sdk.models.crm.imports.ImportGetParams
import com.hubspot.sdk.models.crm.imports.ImportListErrorsPageAsync
import com.hubspot.sdk.models.crm.imports.ImportListErrorsParams
import com.hubspot.sdk.models.crm.imports.ImportListPageAsync
import com.hubspot.sdk.models.crm.imports.ImportListParams
import com.hubspot.sdk.models.crm.imports.PublicImportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ImportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportServiceAsync

    fun create(): CompletableFuture<PublicImportResponse> = create(ImportCreateParams.none())

    /** @see create */
    fun create(
        params: ImportCreateParams = ImportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicImportResponse>

    /** @see create */
    fun create(
        params: ImportCreateParams = ImportCreateParams.none()
    ): CompletableFuture<PublicImportResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<PublicImportResponse> =
        create(ImportCreateParams.none(), requestOptions)

    fun list(): CompletableFuture<ImportListPageAsync> = list(ImportListParams.none())

    /** @see list */
    fun list(
        params: ImportListParams = ImportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportListPageAsync>

    /** @see list */
    fun list(
        params: ImportListParams = ImportListParams.none()
    ): CompletableFuture<ImportListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ImportListPageAsync> =
        list(ImportListParams.none(), requestOptions)

    fun cancel(importId: Long): CompletableFuture<ActionResponse> =
        cancel(importId, ImportCancelParams.none())

    /** @see cancel */
    fun cancel(
        importId: Long,
        params: ImportCancelParams = ImportCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponse> =
        cancel(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        importId: Long,
        params: ImportCancelParams = ImportCancelParams.none(),
    ): CompletableFuture<ActionResponse> = cancel(importId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ImportCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponse>

    /** @see cancel */
    fun cancel(params: ImportCancelParams): CompletableFuture<ActionResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(importId: Long, requestOptions: RequestOptions): CompletableFuture<ActionResponse> =
        cancel(importId, ImportCancelParams.none(), requestOptions)

    fun get(importId: Long): CompletableFuture<PublicImportResponse> =
        get(importId, ImportGetParams.none())

    /** @see get */
    fun get(
        importId: Long,
        params: ImportGetParams = ImportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicImportResponse> =
        get(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see get */
    fun get(
        importId: Long,
        params: ImportGetParams = ImportGetParams.none(),
    ): CompletableFuture<PublicImportResponse> = get(importId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ImportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicImportResponse>

    /** @see get */
    fun get(params: ImportGetParams): CompletableFuture<PublicImportResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        importId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicImportResponse> =
        get(importId, ImportGetParams.none(), requestOptions)

    fun listErrors(importId: Long): CompletableFuture<ImportListErrorsPageAsync> =
        listErrors(importId, ImportListErrorsParams.none())

    /** @see listErrors */
    fun listErrors(
        importId: Long,
        params: ImportListErrorsParams = ImportListErrorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportListErrorsPageAsync> =
        listErrors(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see listErrors */
    fun listErrors(
        importId: Long,
        params: ImportListErrorsParams = ImportListErrorsParams.none(),
    ): CompletableFuture<ImportListErrorsPageAsync> =
        listErrors(importId, params, RequestOptions.none())

    /** @see listErrors */
    fun listErrors(
        params: ImportListErrorsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportListErrorsPageAsync>

    /** @see listErrors */
    fun listErrors(params: ImportListErrorsParams): CompletableFuture<ImportListErrorsPageAsync> =
        listErrors(params, RequestOptions.none())

    /** @see listErrors */
    fun listErrors(
        importId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<ImportListErrorsPageAsync> =
        listErrors(importId, ImportListErrorsParams.none(), requestOptions)

    /**
     * A view of [ImportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/imports/2026-03`, but is otherwise the same as
         * [ImportServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            create(ImportCreateParams.none())

        /** @see create */
        fun create(
            params: ImportCreateParams = ImportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>>

        /** @see create */
        fun create(
            params: ImportCreateParams = ImportCreateParams.none()
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            create(ImportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03`, but is otherwise the same as
         * [ImportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ImportListPageAsync>> =
            list(ImportListParams.none())

        /** @see list */
        fun list(
            params: ImportListParams = ImportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportListPageAsync>>

        /** @see list */
        fun list(
            params: ImportListParams = ImportListParams.none()
        ): CompletableFuture<HttpResponseFor<ImportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ImportListPageAsync>> =
            list(ImportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/imports/2026-03/{importId}/cancel`, but is
         * otherwise the same as [ImportServiceAsync.cancel].
         */
        fun cancel(importId: Long): CompletableFuture<HttpResponseFor<ActionResponse>> =
            cancel(importId, ImportCancelParams.none())

        /** @see cancel */
        fun cancel(
            importId: Long,
            params: ImportCancelParams = ImportCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            cancel(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            importId: Long,
            params: ImportCancelParams = ImportCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            cancel(importId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ImportCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>>

        /** @see cancel */
        fun cancel(params: ImportCancelParams): CompletableFuture<HttpResponseFor<ActionResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            importId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            cancel(importId, ImportCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03/{importId}`, but is otherwise
         * the same as [ImportServiceAsync.get].
         */
        fun get(importId: Long): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            get(importId, ImportGetParams.none())

        /** @see get */
        fun get(
            importId: Long,
            params: ImportGetParams = ImportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            get(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see get */
        fun get(
            importId: Long,
            params: ImportGetParams = ImportGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            get(importId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ImportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>>

        /** @see get */
        fun get(params: ImportGetParams): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            importId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> =
            get(importId, ImportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03/{importId}/errors`, but is
         * otherwise the same as [ImportServiceAsync.listErrors].
         */
        fun listErrors(
            importId: Long
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> =
            listErrors(importId, ImportListErrorsParams.none())

        /** @see listErrors */
        fun listErrors(
            importId: Long,
            params: ImportListErrorsParams = ImportListErrorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> =
            listErrors(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see listErrors */
        fun listErrors(
            importId: Long,
            params: ImportListErrorsParams = ImportListErrorsParams.none(),
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> =
            listErrors(importId, params, RequestOptions.none())

        /** @see listErrors */
        fun listErrors(
            params: ImportListErrorsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>>

        /** @see listErrors */
        fun listErrors(
            params: ImportListErrorsParams
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> =
            listErrors(params, RequestOptions.none())

        /** @see listErrors */
        fun listErrors(
            importId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> =
            listErrors(importId, ImportListErrorsParams.none(), requestOptions)
    }
}
