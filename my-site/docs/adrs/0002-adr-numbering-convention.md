---
sidebar_position: 3
---

# ADR-0002: ADR Numbering Convention

**Status:** Accepted  
**Date:** 2025-01-27  
**Deciders:** Development Team  
**Consulted:** Technical Leads  
**Informed:** All Team Members

## Context

We need to establish a consistent numbering convention for Architecture Decision Records to ensure they can be easily referenced, organized, and maintained over time.

Key requirements:
- Unique identification for each ADR
- Easy to reference in discussions and code
- Maintainable ordering system
- Clear relationship to chronological order

## Decision

We will use a four-digit zero-padded numbering system (0001, 0002, etc.) for ADR identification.

## Consequences

### Positive Consequences
- **Unique Identification**: Each ADR has a clear, unique identifier
- **Easy Reference**: Simple numbering system makes it easy to reference ADRs
- **Chronological Order**: Numbers reflect the order in which decisions were made
- **File Sorting**: Natural alphabetical sorting in file systems
- **Scalability**: Can handle up to 9,999 ADRs
- **Consistency**: Standard format across all ADRs

### Negative Consequences
- **Sequential Dependency**: Numbers must be assigned sequentially
- **Gap Management**: Need to handle gaps if ADRs are withdrawn
- **Coordination**: Team needs to coordinate on number assignment

## Alternatives Considered

- **Date-based (YYYY-MM-DD)**: More descriptive but longer - Rejected because it's harder to reference
- **UUID**: Globally unique but not human-friendly - Rejected because it's difficult to reference
- **Short codes**: Concise but potentially ambiguous - Rejected because of potential conflicts
- **Hierarchical (1.1, 1.2)**: Good for categorization but complex - Rejected because it's harder to maintain

## Implementation Notes

- ADR files will be named as `XXXX-title.md` where XXXX is the four-digit number
- Numbers will be assigned sequentially as ADRs are created
- The template ADR uses number 0000
- First real ADR starts at 0001
- Numbers are never reused, even if an ADR is withdrawn

## References

- [ADR Template](0000-template.md)
- [ADR-0001: Use Docusaurus for Documentation](0001-use-docusaurus.md)
