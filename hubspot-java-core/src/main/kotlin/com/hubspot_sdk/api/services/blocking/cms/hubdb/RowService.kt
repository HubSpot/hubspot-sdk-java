// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.hubdb.BatchResponseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import java.util.function.Consumer

interface RowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService

    /**
     * Add a new row to a HubDB table. New rows will be added to the draft version of the table. Use
     * the `/publish` endpoint to push these changes to published version.
     */
    fun create(tableIdOrName: String, params: RowCreateParams): HubDbTableRowV3 =
        create(tableIdOrName, params, RequestOptions.none())

    /** @see create */
    fun create(
        tableIdOrName: String,
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 =
        create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see create */
    fun create(params: RowCreateParams): HubDbTableRowV3 = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Returns a set of rows in the published version of the specified table. Row results can be
     * filtered and sorted. Filtering and sorting options will be sent as query parameters to the
     * API request. For example, by adding the query parameters `column1__gt=5&sort=-column1`, API
     * returns the rows with values for column `column1` greater than 5 and in the descending order
     * of `column1` values. Refer to the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#filtering-and-sorting-table-rows)
     * for detailed filtering and sorting options. **Note:** This endpoint can be accessed without
     * any authentication, if the table is set to be allowed for public access.
     */
    fun list(tableIdOrName: String): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        list(tableIdOrName, RowListParams.none())

    /** @see list */
    fun list(
        tableIdOrName: String,
        params: RowListParams = RowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see list */
    fun list(
        tableIdOrName: String,
        params: RowListParams = RowListParams.none(),
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        list(tableIdOrName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3

    /** @see list */
    fun list(params: RowListParams): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        list(tableIdOrName, RowListParams.none(), requestOptions)

    /**
     * Clones rows in the draft version of the specified table, given a set of row ids. Maximum of
     * 100 row ids per call.
     */
    fun cloneBatch(
        tableIdOrName: String,
        params: RowCloneBatchParams,
    ): BatchResponseHubDbTableRowV3 = cloneBatch(tableIdOrName, params, RequestOptions.none())

    /** @see cloneBatch */
    fun cloneBatch(
        tableIdOrName: String,
        params: RowCloneBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        cloneBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see cloneBatch */
    fun cloneBatch(params: RowCloneBatchParams): BatchResponseHubDbTableRowV3 =
        cloneBatch(params, RequestOptions.none())

    /** @see cloneBatch */
    fun cloneBatch(
        params: RowCloneBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /** Clones a single row in the draft version of a table. */
    fun cloneDraft(rowId: String, params: RowCloneDraftParams): HubDbTableRowV3 =
        cloneDraft(rowId, params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        rowId: String,
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see cloneDraft */
    fun cloneDraft(params: RowCloneDraftParams): HubDbTableRowV3 =
        cloneDraft(params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Creates rows in the draft version of the specified table, given an array of row objects.
     * Maximum of 100 row object per call. See the overview section for more details with an
     * example.
     */
    fun createBatch(
        tableIdOrName: String,
        params: RowCreateBatchParams,
    ): BatchResponseHubDbTableRowV3 = createBatch(tableIdOrName, params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        tableIdOrName: String,
        params: RowCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        createBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see createBatch */
    fun createBatch(params: RowCreateBatchParams): BatchResponseHubDbTableRowV3 =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: RowCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /** Permanently deletes a row from a table's draft version. */
    fun deleteDraft(rowId: String, params: RowDeleteDraftParams) =
        deleteDraft(rowId, params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        rowId: String,
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see deleteDraft */
    fun deleteDraft(params: RowDeleteDraftParams) = deleteDraft(params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Get a single row by ID from the published version of a table. **Note:** This endpoint can be
     * accessed without any authentication, if the table is set to be allowed for public access.
     */
    fun get(rowId: String, params: RowGetParams): HubDbTableRowV3 =
        get(rowId, params, RequestOptions.none())

    /** @see get */
    fun get(
        rowId: String,
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = get(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see get */
    fun get(params: RowGetParams): HubDbTableRowV3 = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Returns rows in the published version of the specified table, given a set of row IDs.
     * **Note:** This endpoint can be accessed without any authentication if the table is set to be
     * allowed for public access.
     */
    fun getBatch(tableIdOrName: String, params: RowGetBatchParams): BatchResponseHubDbTableRowV3 =
        getBatch(tableIdOrName, params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        tableIdOrName: String,
        params: RowGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        getBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getBatch */
    fun getBatch(params: RowGetBatchParams): BatchResponseHubDbTableRowV3 =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: RowGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /** Get a single row by ID from a table's draft version. */
    fun getDraft(rowId: String, params: RowGetDraftParams): HubDbTableRowV3 =
        getDraft(rowId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        rowId: String,
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(params: RowGetDraftParams): HubDbTableRowV3 =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /** Returns rows in the draft version of the specified table, given a set of row IDs. */
    fun getDraftBatch(
        tableIdOrName: String,
        params: RowGetDraftBatchParams,
    ): BatchResponseHubDbTableRowV3 = getDraftBatch(tableIdOrName, params, RequestOptions.none())

    /** @see getDraftBatch */
    fun getDraftBatch(
        tableIdOrName: String,
        params: RowGetDraftBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        getDraftBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getDraftBatch */
    fun getDraftBatch(params: RowGetDraftBatchParams): BatchResponseHubDbTableRowV3 =
        getDraftBatch(params, RequestOptions.none())

    /** @see getDraftBatch */
    fun getDraftBatch(
        params: RowGetDraftBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /**
     * Permanently delete rows from the draft version of a table, given a set of row IDs. Maximum of
     * 100 row IDs per call.
     */
    fun purgeBatch(tableIdOrName: String, params: RowPurgeBatchParams) =
        purgeBatch(tableIdOrName, params, RequestOptions.none())

    /** @see purgeBatch */
    fun purgeBatch(
        tableIdOrName: String,
        params: RowPurgeBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = purgeBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see purgeBatch */
    fun purgeBatch(params: RowPurgeBatchParams) = purgeBatch(params, RequestOptions.none())

    /** @see purgeBatch */
    fun purgeBatch(
        params: RowPurgeBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replaces multiple rows as a batch in the draft version of the table, with a maximum of 100
     * rows per call. See the endpoint `PUT /tables/{tableIdOrName}/rows/{rowId}/draft` for details
     * on updating a single row.
     */
    fun replaceBatch(
        tableIdOrName: String,
        params: RowReplaceBatchParams,
    ): BatchResponseHubDbTableRowV3 = replaceBatch(tableIdOrName, params, RequestOptions.none())

    /** @see replaceBatch */
    fun replaceBatch(
        tableIdOrName: String,
        params: RowReplaceBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        replaceBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see replaceBatch */
    fun replaceBatch(params: RowReplaceBatchParams): BatchResponseHubDbTableRowV3 =
        replaceBatch(params, RequestOptions.none())

    /** @see replaceBatch */
    fun replaceBatch(
        params: RowReplaceBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /**
     * Replace a single row in the draft version of a table. All column values must be specified. If
     * a column has a value in the target table and this request doesn't define that value, it will
     * be deleted. See the "Create a row" endpoint for instructions on how to format the JSON row
     * definitions.
     */
    fun replaceDraft(rowId: String, params: RowReplaceDraftParams): HubDbTableRowV3 =
        replaceDraft(rowId, params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        rowId: String,
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see replaceDraft */
    fun replaceDraft(params: RowReplaceDraftParams): HubDbTableRowV3 =
        replaceDraft(params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Updates multiple rows as a batch in the draft version of the table, with a maximum of 100
     * rows per call. See the endpoint `PATCH /tables/{tableIdOrName}/rows/{rowId}/draft` for
     * details on updating a single row.
     */
    fun updateBatch(
        tableIdOrName: String,
        params: RowUpdateBatchParams,
    ): BatchResponseHubDbTableRowV3 = updateBatch(tableIdOrName, params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        tableIdOrName: String,
        params: RowUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3 =
        updateBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see updateBatch */
    fun updateBatch(params: RowUpdateBatchParams): BatchResponseHubDbTableRowV3 =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: RowUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseHubDbTableRowV3

    /**
     * Partially update a single row in the table's draft version. All the column values need not be
     * specified. Only the columns or fields that needs to be modified can be specified. See the
     * "Create a row" endpoint for instructions on how to format the JSON row definitions.
     */
    fun updateDraft(rowId: String, params: RowUpdateDraftParams): HubDbTableRowV3 =
        updateDraft(rowId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        rowId: String,
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: RowUpdateDraftParams): HubDbTableRowV3 =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows`,
         * but is otherwise the same as [RowService.create].
         */
        @MustBeClosed
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
        ): HttpResponseFor<HubDbTableRowV3> = create(tableIdOrName, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RowCreateParams): HttpResponseFor<HubDbTableRowV3> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows`, but
         * is otherwise the same as [RowService.list].
         */
        @MustBeClosed
        fun list(
            tableIdOrName: String
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            list(tableIdOrName, RowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            list(tableIdOrName, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RowListParams
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            list(tableIdOrName, RowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/clone`, but is otherwise the
         * same as [RowService.cloneBatch].
         */
        @MustBeClosed
        fun cloneBatch(
            tableIdOrName: String,
            params: RowCloneBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            cloneBatch(tableIdOrName, params, RequestOptions.none())

        /** @see cloneBatch */
        @MustBeClosed
        fun cloneBatch(
            tableIdOrName: String,
            params: RowCloneBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            cloneBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see cloneBatch */
        @MustBeClosed
        fun cloneBatch(params: RowCloneBatchParams): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            cloneBatch(params, RequestOptions.none())

        /** @see cloneBatch */
        @MustBeClosed
        fun cloneBatch(
            params: RowCloneBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft/clone`, but is otherwise the
         * same as [RowService.cloneDraft].
         */
        @MustBeClosed
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = cloneDraft(rowId, params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(params: RowCloneDraftParams): HttpResponseFor<HubDbTableRowV3> =
            cloneDraft(params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/create`, but is otherwise the
         * same as [RowService.createBatch].
         */
        @MustBeClosed
        fun createBatch(
            tableIdOrName: String,
            params: RowCreateBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            createBatch(tableIdOrName, params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            tableIdOrName: String,
            params: RowCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            createBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: RowCreateBatchParams
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: RowCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same
         * as [RowService.deleteDraft].
         */
        @MustBeClosed
        fun deleteDraft(rowId: String, params: RowDeleteDraftParams): HttpResponse =
            deleteDraft(rowId, params, RequestOptions.none())

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(
            rowId: String,
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(params: RowDeleteDraftParams): HttpResponse =
            deleteDraft(params, RequestOptions.none())

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}`, but is otherwise the same as
         * [RowService.get].
         */
        @MustBeClosed
        fun get(rowId: String, params: RowGetParams): HttpResponseFor<HubDbTableRowV3> =
            get(rowId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            rowId: String,
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            get(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: RowGetParams): HttpResponseFor<HubDbTableRowV3> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/batch/read`, but is otherwise the same as
         * [RowService.getBatch].
         */
        @MustBeClosed
        fun getBatch(
            tableIdOrName: String,
            params: RowGetBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getBatch(tableIdOrName, params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            tableIdOrName: String,
            params: RowGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(params: RowGetBatchParams): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: RowGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `get
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same
         * as [RowService.getDraft].
         */
        @MustBeClosed
        fun getDraft(rowId: String, params: RowGetDraftParams): HttpResponseFor<HubDbTableRowV3> =
            getDraft(rowId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            rowId: String,
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: RowGetDraftParams): HttpResponseFor<HubDbTableRowV3> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/read`, but is otherwise the
         * same as [RowService.getDraftBatch].
         */
        @MustBeClosed
        fun getDraftBatch(
            tableIdOrName: String,
            params: RowGetDraftBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getDraftBatch(tableIdOrName, params, RequestOptions.none())

        /** @see getDraftBatch */
        @MustBeClosed
        fun getDraftBatch(
            tableIdOrName: String,
            params: RowGetDraftBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getDraftBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getDraftBatch */
        @MustBeClosed
        fun getDraftBatch(
            params: RowGetDraftBatchParams
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            getDraftBatch(params, RequestOptions.none())

        /** @see getDraftBatch */
        @MustBeClosed
        fun getDraftBatch(
            params: RowGetDraftBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/purge`, but is otherwise the
         * same as [RowService.purgeBatch].
         */
        @MustBeClosed
        fun purgeBatch(tableIdOrName: String, params: RowPurgeBatchParams): HttpResponse =
            purgeBatch(tableIdOrName, params, RequestOptions.none())

        /** @see purgeBatch */
        @MustBeClosed
        fun purgeBatch(
            tableIdOrName: String,
            params: RowPurgeBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            purgeBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see purgeBatch */
        @MustBeClosed
        fun purgeBatch(params: RowPurgeBatchParams): HttpResponse =
            purgeBatch(params, RequestOptions.none())

        /** @see purgeBatch */
        @MustBeClosed
        fun purgeBatch(
            params: RowPurgeBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/replace`, but is otherwise the
         * same as [RowService.replaceBatch].
         */
        @MustBeClosed
        fun replaceBatch(
            tableIdOrName: String,
            params: RowReplaceBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            replaceBatch(tableIdOrName, params, RequestOptions.none())

        /** @see replaceBatch */
        @MustBeClosed
        fun replaceBatch(
            tableIdOrName: String,
            params: RowReplaceBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            replaceBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see replaceBatch */
        @MustBeClosed
        fun replaceBatch(
            params: RowReplaceBatchParams
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            replaceBatch(params, RequestOptions.none())

        /** @see replaceBatch */
        @MustBeClosed
        fun replaceBatch(
            params: RowReplaceBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `put
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same
         * as [RowService.replaceDraft].
         */
        @MustBeClosed
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = replaceDraft(rowId, params, RequestOptions.none())

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(params: RowReplaceDraftParams): HttpResponseFor<HubDbTableRowV3> =
            replaceDraft(params, RequestOptions.none())

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/update`, but is otherwise the
         * same as [RowService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(
            tableIdOrName: String,
            params: RowUpdateBatchParams,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            updateBatch(tableIdOrName, params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            tableIdOrName: String,
            params: RowUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            updateBatch(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: RowUpdateBatchParams
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: RowUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseHubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `patch
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same
         * as [RowService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = updateDraft(rowId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: RowUpdateDraftParams): HttpResponseFor<HubDbTableRowV3> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>
    }
}
