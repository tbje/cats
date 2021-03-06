package cats.kernel
package instances

package object all extends AllInstances

trait AllInstances
    extends BigDecimalInstances
    with BigIntInstances
    with BitSetInstances
    with BooleanInstances
    with ByteInstances
    with CharInstances
    with DoubleInstances
    // with DurationInstances // left out for bincompat
    with FloatInstances
    with FunctionInstances
    with IntInstances
    with ListInstances
    with LongInstances
    with MapInstances
    with OptionInstances
    // with QueueInstances // left out for bincompat
    with SetInstances
    with ShortInstances
    with StreamInstances
    with StringInstances
    with SymbolInstances
    with TupleInstances
    with UnitInstances
    with UUIDInstances
    with VectorInstances
