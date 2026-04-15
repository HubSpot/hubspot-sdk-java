// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.ActionResponse
import com.hubspot.sdk.models.crm.imports.ImportCancelParams
import com.hubspot.sdk.models.crm.imports.ImportCreateParams
import com.hubspot.sdk.models.crm.imports.ImportGetParams
import com.hubspot.sdk.models.crm.imports.ImportListErrorsPage
import com.hubspot.sdk.models.crm.imports.ImportListErrorsParams
import com.hubspot.sdk.models.crm.imports.ImportListPage
import com.hubspot.sdk.models.crm.imports.ImportListParams
import com.hubspot.sdk.models.crm.imports.PublicImportResponse
import java.util.function.Consumer

interface ImportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService

    fun create(): PublicImportResponse = create(ImportCreateParams.none())

    /** @see create */
    fun create(
        params: ImportCreateParams = ImportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicImportResponse

    /** @see create */
    fun create(params: ImportCreateParams = ImportCreateParams.none()): PublicImportResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): PublicImportResponse =
        create(ImportCreateParams.none(), requestOptions)

    fun list(): ImportListPage = list(ImportListParams.none())

    /** @see list */
    fun list(
        params: ImportListParams = ImportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportListPage

    /** @see list */
    fun list(params: ImportListParams = ImportListParams.none()): ImportListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ImportListPage =
        list(ImportListParams.none(), requestOptions)

    fun cancel(importId: Long): ActionResponse = cancel(importId, ImportCancelParams.none())

    /** @see cancel */
    fun cancel(
        importId: Long,
        params: ImportCancelParams = ImportCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponse = cancel(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        importId: Long,
        params: ImportCancelParams = ImportCancelParams.none(),
    ): ActionResponse = cancel(importId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ImportCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponse

    /** @see cancel */
    fun cancel(params: ImportCancelParams): ActionResponse = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(importId: Long, requestOptions: RequestOptions): ActionResponse =
        cancel(importId, ImportCancelParams.none(), requestOptions)

    fun get(importId: Long): PublicImportResponse = get(importId, ImportGetParams.none())

    /** @see get */
    fun get(
        importId: Long,
        params: ImportGetParams = ImportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicImportResponse = get(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see get */
    fun get(
        importId: Long,
        params: ImportGetParams = ImportGetParams.none(),
    ): PublicImportResponse = get(importId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ImportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicImportResponse

    /** @see get */
    fun get(params: ImportGetParams): PublicImportResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(importId: Long, requestOptions: RequestOptions): PublicImportResponse =
        get(importId, ImportGetParams.none(), requestOptions)

    fun listErrors(importId: Long): ImportListErrorsPage =
        listErrors(importId, ImportListErrorsParams.none())

    /** @see listErrors */
    fun listErrors(
        importId: Long,
        params: ImportListErrorsParams = ImportListErrorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportListErrorsPage =
        listErrors(params.toBuilder().importId(importId).build(), requestOptions)

    /** @see listErrors */
    fun listErrors(
        importId: Long,
        params: ImportListErrorsParams = ImportListErrorsParams.none(),
    ): ImportListErrorsPage = listErrors(importId, params, RequestOptions.none())

    /** @see listErrors */
    fun listErrors(
        params: ImportListErrorsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportListErrorsPage

    /** @see listErrors */
    fun listErrors(params: ImportListErrorsParams): ImportListErrorsPage =
        listErrors(params, RequestOptions.none())

    /** @see listErrors */
    fun listErrors(importId: Long, requestOptions: RequestOptions): ImportListErrorsPage =
        listErrors(importId, ImportListErrorsParams.none(), requestOptions)

    /** A view of [ImportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/imports/2026-03`, but is otherwise the same as
         * [ImportService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<PublicImportResponse> = create(ImportCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ImportCreateParams = ImportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicImportResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ImportCreateParams = ImportCreateParams.none()
        ): HttpResponseFor<PublicImportResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<PublicImportResponse> =
            create(ImportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03`, but is otherwise the same as
         * [ImportService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ImportListPage> = list(ImportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ImportListParams = ImportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ImportListParams = ImportListParams.none()
        ): HttpResponseFor<ImportListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ImportListPage> =
            list(ImportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/imports/2026-03/{importId}/cancel`, but is
         * otherwise the same as [ImportService.cancel].
         */
        @MustBeClosed
        fun cancel(importId: Long): HttpResponseFor<ActionResponse> =
            cancel(importId, ImportCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            importId: Long,
            params: ImportCancelParams = ImportCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponse> =
            cancel(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            importId: Long,
            params: ImportCancelParams = ImportCancelParams.none(),
        ): HttpResponseFor<ActionResponse> = cancel(importId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ImportCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ImportCancelParams): HttpResponseFor<ActionResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            importId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponse> =
            cancel(importId, ImportCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03/{importId}`, but is otherwise
         * the same as [ImportService.get].
         */
        @MustBeClosed
        fun get(importId: Long): HttpResponseFor<PublicImportResponse> =
            get(importId, ImportGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            importId: Long,
            params: ImportGetParams = ImportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicImportResponse> =
            get(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            importId: Long,
            params: ImportGetParams = ImportGetParams.none(),
        ): HttpResponseFor<PublicImportResponse> = get(importId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ImportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicImportResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ImportGetParams): HttpResponseFor<PublicImportResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            importId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicImportResponse> =
            get(importId, ImportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/imports/2026-03/{importId}/errors`, but is
         * otherwise the same as [ImportService.listErrors].
         */
        @MustBeClosed
        fun listErrors(importId: Long): HttpResponseFor<ImportListErrorsPage> =
            listErrors(importId, ImportListErrorsParams.none())

        /** @see listErrors */
        @MustBeClosed
        fun listErrors(
            importId: Long,
            params: ImportListErrorsParams = ImportListErrorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportListErrorsPage> =
            listErrors(params.toBuilder().importId(importId).build(), requestOptions)

        /** @see listErrors */
        @MustBeClosed
        fun listErrors(
            importId: Long,
            params: ImportListErrorsParams = ImportListErrorsParams.none(),
        ): HttpResponseFor<ImportListErrorsPage> =
            listErrors(importId, params, RequestOptions.none())

        /** @see listErrors */
        @MustBeClosed
        fun listErrors(
            params: ImportListErrorsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportListErrorsPage>

        /** @see listErrors */
        @MustBeClosed
        fun listErrors(params: ImportListErrorsParams): HttpResponseFor<ImportListErrorsPage> =
            listErrors(params, RequestOptions.none())

        /** @see listErrors */
        @MustBeClosed
        fun listErrors(
            importId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportListErrorsPage> =
            listErrors(importId, ImportListErrorsParams.none(), requestOptions)
    }
}
